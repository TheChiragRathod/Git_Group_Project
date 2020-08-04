package com.example.git_group_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class spalsh extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {

                Intent intent =new Intent(spalsh.this,login.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);


    }






}