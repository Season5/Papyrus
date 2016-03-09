package com.example.taifa.fivelayouts;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        addListenerOnButton2();
        addListenerOnButton3();
        addListenerOnButton4();
    }

    public void addListenerOnButton() {

        final Context context = this;

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Layout2.class);
                startActivity(intent);

            }

        });
    }
    public void addListenerOnButton2() {

        final Context context = this;

        button = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Layout3.class);
                startActivity(intent);

            }

        });
    }
    public void addListenerOnButton3() {

        final Context context = this;

        button = (Button) findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Layout4.class);
                startActivity(intent);

            }

        });
    }
    public void addListenerOnButton4() {

        final Context context = this;

        button = (Button) findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Layout5.class);
                startActivity(intent);

            }

        });
    }

}
