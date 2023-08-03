package com.example.ourproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class activity_contact extends AppCompatActivity {
ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact2);
        imageButton = (ImageButton) findViewById(R.id.home);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_contact.this,MainActivity.class);
                startActivity(intent);
            }
        });
        imageButton = (ImageButton) findViewById(R.id.aboutus);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_contact.this,aboutus.class);
                startActivity(intent);
            }
        });
        imageButton = (ImageButton) findViewById(R.id.map);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_contact.this,product.class);
                startActivity(intent);
            }
        }); }
}