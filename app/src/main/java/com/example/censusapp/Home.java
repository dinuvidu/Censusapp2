package com.example.censusapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import yuku.ambilwarna.AmbilWarnaDialog;

public class Home extends AppCompatActivity {
    RelativeLayout relativeLayout;
    int defaultColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

//        relativeLayout = findViewById(R.id.layout);
//        defaultColor = ContextCompat.getColor(Home.this, com.google.android.material.R.color.design_default_color_primary);

    }

    public void openColorPicker()
    {
        AmbilWarnaDialog ambilWarnaDialog = new AmbilWarnaDialog(this, defaultColor, new AmbilWarnaDialog.OnAmbilWarnaListener() {
            @Override
            public void onCancel(AmbilWarnaDialog dialog) {

            }

            @Override
            public void onOk(AmbilWarnaDialog dialog, int color) {

                defaultColor = color;
                relativeLayout.setBackgroundColor(defaultColor);

            }
        });
        ambilWarnaDialog.show();
    }

    public void OnClick(View view) {
        openColorPicker();
    }
}