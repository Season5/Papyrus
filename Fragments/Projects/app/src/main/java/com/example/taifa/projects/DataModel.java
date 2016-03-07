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

    private ArrayList<Projects> coursesArray = new ArrayList<Projects>();
    private Context ctx;

    private static  String TAG = "DataModel";

    // Initializer to read a text file into an array of golfcourse objects
    public DataModel(Context ctx, String coursesFilename) {
        String line;
        BufferedReader br;

        try {
            br = new BufferedReader(new InputStreamReader(ctx.getAssets().open(coursesFilename)));

            while ((line = br.readLine()) != null) {
                StringTokenizer sTok = new StringTokenizer(line, ":");
                Projects gc = new Projects(sTok.nextToken());
                gc.address = sTok.nextToken();
                coursesArray.add(gc);
            }
        } catch (IOException e) {
            return;
        }
    }





}
