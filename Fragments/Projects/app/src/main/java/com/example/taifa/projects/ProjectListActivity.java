package com.example.taifa.projects;

import android.app.Activity;
import android.app.Fragment;
//import android.app.FragmentManager;
import android.support.v4.app.FragmentManager;
import android.app.ListFragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



import com.example.taifa.projects.dummy.DummyContent;

import java.util.ArrayList;
import java.util.List;

/**
 * An activity representing a list of projects. This activity
 * has different presentations for handset and tablet-size devices. On
 * handsets, the activity presents a list of items, which when touched,
 * lead to a {@link ProjectDetailActivity} representing
 * item details. On tablets, the activity presents the list of items and
 * item details side-by-side using two vertical panes.
 */
public class ProjectListActivity extends FragmentActivity
        implements ProjectListFragment.Callbacks {

    /**
     * Whether or not the activity is in two-pane mode, i.e. running on a tablet
     * device.
     */
    private boolean mTwoPane;

    private static  String TAG = "ProjectListActivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get golf courses from a file named courses.txt
        DataModel dataModel = new DataModel(this, "Project");
        ArrayList<Projects> projects = dataModel.getProjects();

        FragmentManager fm = getSupportFragmentManager();
        setContentView(R.layout.activity_project_list);

        if (findViewById(R.id.project_detail_container) != null) {
            mTwoPane = true;
            // Its a tablet, so create a new detail fragment if one does not already exist
            ProjectDetailFragment df = (ProjectDetailFragment) fm.findFragmentByTag("Detail");
            if (df == null) {
                // Initialize new detail fragment
                df = new ProjectDetailFragment();
                Bundle args = new Bundle();
                args.putParcelable("course", new ProjectsDetail("Welcome to First Master/Detail"));
                df.setArguments(args);
                fm.beginTransaction().replace(R.id.project_detail_container, df, "Detail").commit();
            }
        }
        // Initialize a new golfcourse list fragment, if one does not already exist
        ProjectListFragment cf = (ProjectListFragment) fm.findFragmentByTag("List");
        if ( cf == null) {
            cf = new ProjectListFragment();
            Bundle arguments = new Bundle();
            arguments.putParcelableArrayList("Projects", dataModel.getProjects());
            cf.setArguments(arguments);
            fm.beginTransaction().replace(R.id.project_list, cf, "List").commit();
        }
    }

    /**
     * Callback method from {@link ProjectListFragment.Callbacks}
     * indicating that the item with the given ID was selected.
     */
    @Override
    public void onItemSelected(Projects c) {
        if (mTwoPane) {
            // In two-pane mode, show the detail view in this activity by
            // adding or replacing the detail fragment using a
            // fragment transaction.
            Bundle arguments = new Bundle();
            // Pass the selected Golfcourse object to the DetailFragment
            arguments.putParcelable("course", c);
            ProjectDetailFragment fragment = new ProjectDetailFragment();
            fragment.setArguments(arguments);
            getFragmentManager().beginTransaction()
                    .replace(R.id.project_detail_container, fragment)
                    .commit();

        } else {
            // In single-pane mode, simply start the detail activity
            // for the selected item ID.
            Intent detailIntent = new Intent(this, ProjectDetailActivity.class);
            // Pass the selected Golfcourse object to the DetailActivity
            detailIntent.putExtra("course", c);
            startActivity(detailIntent);
        }
    }
}
