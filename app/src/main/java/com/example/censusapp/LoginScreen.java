package com.example.censusapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import android.widget.EditText;
import android.widget.Toast;

public class LoginScreen extends AppCompatActivity {
    private EditText editText;
    private int errorCount = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        editText = (EditText) findViewById(R.id.LoginPassword);


    }


    public void OnClick(View view) {
        Intent intent;

        SharedPreferences sharedPreferences = getSharedPreferences("Shared Pref", MODE_PRIVATE);
        String password = sharedPreferences.getString("Password", "");

        String typePassword = editText.getText().toString();

        if (password.equals(typePassword)) {
            intent = new Intent(LoginScreen.this, Home.class);
            startActivity(intent);
            finish();
        } else {
            editText.setError("worng password");
            errorCount++;
            if (errorCount >= 3) {
                Context context = getApplicationContext();
                CharSequence text = "Wrong password, Closing App";
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                LoginScreen.this.finish();
                System.exit(0);

            }
}}}