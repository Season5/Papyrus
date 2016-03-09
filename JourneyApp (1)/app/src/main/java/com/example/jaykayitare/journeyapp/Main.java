package com.example.jaykayitare.journeyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button cohort1 = (Button)findViewById(R.id.cohort1);
        Button cohort2 = (Button)findViewById(R.id.cohort2);
        Button cohort3 = (Button)findViewById(R.id.cohort3);
        Button cohort4 = (Button)findViewById(R.id.cohort4);
        Button cohort5 = (Button)findViewById(R.id.cohort5);
        cohort1.setOnClickListener(this);
        cohort2.setOnClickListener(this);
        cohort3.setOnClickListener(this);
        cohort4.setOnClickListener(this);
        cohort5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cohort1:
                Intent intent1 = new Intent(this,Cohort1.class);
                this.startActivity(intent1);
                break;
            case R.id.cohort2:
                Intent intent2 = new Intent(this,Cohort2.class);
                this.startActivity(intent2);
                break;
            case R.id.cohort3:
                Intent intent3 = new Intent(this,Cohort3.class);
                this.startActivity(intent3);
                break;
            case R.id.cohort4:
                Intent intent4 = new Intent(this,Cohort4.class);
                this.startActivity(intent4);
                break;
            case R.id.cohort5:
                Intent intent5 = new Intent(this,Cohort5.class);
                this.startActivity(intent5);
                break;
        }
    }
}
