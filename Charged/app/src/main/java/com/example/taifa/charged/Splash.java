package com.example.taifa.charged;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {
    private final int SplashDisplayLength = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Intent that will start the Main Activity
                Intent mainIntent = new Intent(Splash.this, charged.class);
                Splash.this.startActivity(mainIntent);
                Splash.this.finish();
            }
        }, SplashDisplayLength);
    }

}
