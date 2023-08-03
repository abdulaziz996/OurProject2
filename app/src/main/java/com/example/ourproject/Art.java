package com.example.ourproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Art extends AppCompatActivity {
    View view;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art);
    }
    public void openProducts(View view) {
        startActivity(new Intent(Art.this, product.class));
    }}