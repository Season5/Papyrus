package com.example.taifa.projects;

import android.app.Activity;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.taifa.projects.dummy.DummyContent;

/**
 * A fragment representing a single Project detail screen.
 * This fragment is either contained in a {@link ProjectListActivity}
 * in two-pane mode (on tablets) or a {@link ProjectDetailActivity}
 * on handsets.
 */
public class ProjectDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ProjectDetailFragment() {
    }

    private Projects Project;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // If intent arguments have a course object, get it
        if (getArguments().containsKey("Project")) {
            Project = getArguments().getParcelable("Project");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_project_detail, container, false);

        // Display the selected golfcourse, or just a welcome message
        if (Project != null) {
            ((TextView) rootView.findViewById(R.id.project_detail)).setText(Project.name);
        }
        else {
            ((TextView) rootView.findViewById(R.id.project_detail)).setText("Welcome to First Master/Detail");
        }

        return rootView;
    }
}
