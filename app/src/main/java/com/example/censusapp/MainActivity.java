package com.example.censusapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent;

                SharedPreferences sharedPreferences=getSharedPreferences("Shared Pref",MODE_PRIVATE);
                String password=sharedPreferences.getString("Password","");



               if (password.equals("")){
                    intent= new Intent(MainActivity.this,Registerscreen.class);
                }
                else{
                    intent = new Intent(MainActivity.this,LoginScreen.class);
                }
                startActivity(intent);
                finish();
            }
        },3000);
 }}