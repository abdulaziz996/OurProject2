package com.example.ourproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class aboutus extends AppCompatActivity {
ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        imageButton = (ImageButton) findViewById(R.id.home);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(aboutus.this,MainActivity.class);
                startActivity(intent);
            }
        });
        imageButton = (ImageButton) findViewById(R.id.msg);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(aboutus.this,activity_contact.class);
                startActivity(intent);
            }
        });
        imageButton = (ImageButton) findViewById(R.id.map);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(aboutus.this,product.class);
                startActivity(intent);
            }
        }); }
}