package com.example.aaaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void rActivityNowShowing (View view){
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(MainActivity.this, NowShowing.class);
        startActivity(intent);
    }

    public void rActivityComingSoon (View view){
        Intent intent = new Intent(MainActivity.this, ComingSoon.class);
        startActivity(intent);
    }

    public void rActivityPopular (View view){
        Intent intent = new Intent(MainActivity.this, Popular.class);
        startActivity(intent);
    }

    public void rActivityExperience (View view){
        Intent intent = new Intent(MainActivity.this, Experience.class);
        startActivity(intent);
    }

    public void rActivitySelectMovie (View view){
        Intent intent = new Intent(MainActivity.this, SelectMovie.class);
        startActivity(intent);
    }
}