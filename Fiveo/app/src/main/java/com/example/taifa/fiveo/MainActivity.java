package com.example.taifa.fiveo;

import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class menu extends AppCompatActivity {
    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        button = (Button) findViewById(R.id.button8);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, home.class);
                startActivity(intent);

            }

        });

    }

}








package com.dismas.imaya.views;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.Button;
/**
 * Created by imaya on 3/1/16.
 */
public class home extends AppCompatActivity {
    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }

}


http://www.mkyong.com/android/android-activity-from-one-screen-to-another-screen/