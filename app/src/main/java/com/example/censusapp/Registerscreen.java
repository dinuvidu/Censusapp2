package com.example.censusapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Registerscreen extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerscreen);

        editText= (EditText) findViewById(R.id.editTextTextPassword);


    }

    public void OnClick(View view) {
        SharedPreferences sharedPreferences= getSharedPreferences("Shared Pref",MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("Password",editText.getText().toString());
        editor.apply();
        Intent intent= new Intent(Registerscreen.this,Home.class);

        startActivity(intent);
        finish();
    }
}