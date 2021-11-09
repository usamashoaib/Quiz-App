package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //For going to menu activty
    public void MenuScreenActivity(View v)
    {
        Intent i = new Intent(MainActivity.this,MenuScreen.class);
        startActivity(i);
    }
}