package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);
    }
    //For going to quiz activity
    public void QuizActivity(View v)
    {
        Intent i = new Intent(MenuScreen.this,Quiz.class);
        startActivity(i);
    }
    //For going to practice activity
    public void PracticeActivity(View v)
    {
        Intent i = new Intent(MenuScreen.this,Practice.class);
        startActivity(i);
    }
}