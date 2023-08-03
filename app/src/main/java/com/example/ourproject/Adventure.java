package com.example.ourproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Adventure extends AppCompatActivity {
    View view;
    Intent intent;    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure);
    }
    public void openProducts(View view) {
        startActivity(new Intent(this, product.class));
    }
    public void openhik(View view){
        startActivity(new Intent(this, hiking.class));
    }
    public void opengoos(View view) {
        startActivity(new Intent(this, Diving.class));

    }public void opencamp(View view){
        startActivity(new Intent(this, Camp.class));
    }
    public void openFire(View view) {
        startActivity(new Intent(this, FireBoat.class));

}}