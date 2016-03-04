package com.example.jaykayitare.journeyapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {
    //Duration of splash display
    private final int SplashDisplayLength = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        /* Handler to start the main activity and
        * close splash screen after a few seconds*/
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Intent that will start the Main Activity
                Intent mainIntent = new Intent(Splash.this, Main.class);
                Splash.this.startActivity(mainIntent);
                Splash.this.finish();
            }
        }, SplashDisplayLength);
    }
}
