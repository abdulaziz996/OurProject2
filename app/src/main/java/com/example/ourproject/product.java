package com.example.ourproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class product extends AppCompatActivity {
    View view;
    ImageButton imageButton; Intent intent;   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        imageButton = (ImageButton) findViewById(R.id.msg);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(product.this,activity_contact.class);
                startActivity(intent);
            }
        });
        imageButton = (ImageButton) findViewById(R.id.aboutus);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(product.this,aboutus.class);
                startActivity(intent);
            }
        });
        imageButton = (ImageButton) findViewById(R.id.home);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(product.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
    public void openAdvanture(View view) {
        startActivity(new Intent(this, Adventure.class));
    }

    public void openCook(View view) {
        startActivity(new Intent(this, Cook.class));
    }}