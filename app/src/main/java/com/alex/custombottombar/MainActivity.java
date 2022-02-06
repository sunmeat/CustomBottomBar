package com.alex.custombottombar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button threeBtn = findViewById(R.id.three_btn);
        threeBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ThreeButtonsActivity.class)));

        Button fourBtn = findViewById(R.id.four_btn);
        fourBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, FourButtonsActivity.class)));
    }
}