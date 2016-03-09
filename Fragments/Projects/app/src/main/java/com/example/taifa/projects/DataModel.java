package com.example.taifa.projects;

import android.content.Context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by taifa on 3/7/16.
 */
public class DataModel {

    private ArrayList<Projects> ProjectsArray = new ArrayList<Projects>();
    private Context ctx;

    private static  String TAG = "DataModel";

    // Initializer to read a text file into an array of Projects objects
    public DataModel(Context ctx, String ProjectsFilename) {
        String line;
        BufferedReader br;

        try {
            br = new BufferedReader(new InputStreamReader(ctx.getAssets().open(ProjectsFilename)));

            while ((line = br.readLine()) != null) {
                StringTokenizer sTok = new StringTokenizer(line, ":");
                Projects gc = new Projects(sTok.nextToken());
                gc.address = sTok.nextToken();
                ProjectsArray.add(gc);
            }
        } catch (IOException e) {
            return;
        }
    }


    // Method to retrieve Projects
    public ArrayList<Projects> getProjects() {
        return ProjectsArray;
    }


}
