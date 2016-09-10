package com.example.administrador.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button)findViewById(R.id.bt_popular_movies)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getToastText(getResources().getString(R.string.popular_movies)), Toast.LENGTH_SHORT).show();
            }
        });

        ((Button)findViewById(R.id.bt_stock_hawk)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getToastText(getResources().getString(R.string.stock_hawk)), Toast.LENGTH_SHORT).show();
            }
        });

        ((Button)findViewById(R.id.bt_build_it_bigger)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getToastText(getResources().getString(R.string.build_it_bigger)), Toast.LENGTH_SHORT).show();
            }
        });

        ((Button)findViewById(R.id.bt_make_your_app_material)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getToastText(getResources().getString(R.string.make_your_app_material)), Toast.LENGTH_SHORT).show();
            }
        });

        ((Button)findViewById(R.id.bt_go_ubiquitous)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getToastText(getResources().getString(R.string.go_ubiquitous)), Toast.LENGTH_SHORT).show();
            }
        });

        ((Button)findViewById(R.id.bt_capstone)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getToastText(getResources().getString(R.string.capstone)), Toast.LENGTH_SHORT).show();
            }
        });


    }

    private String getToastText(String appName) {
        return "This button will launch my " + appName + " app";
    }

}
