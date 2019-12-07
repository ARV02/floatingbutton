package com.example.floating_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    boolean isRotate=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewAnimation.init(findViewById(R.id.combustible));
        FloatingActionButton fab = findViewById(R.id.fabAdd);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isRotate = ViewAnimation.rotateFab(v,!isRotate);
                if(isRotate){
                    ViewAnimation.showIn(findViewById(R.id.combustible));
                }else{
                    ViewAnimation.showOut(findViewById(R.id.combustible));
                }
            }
        });
    }
}
