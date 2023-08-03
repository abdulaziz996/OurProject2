package com.example.ourproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
VideoView videoView;
    private FirebaseAuth auth;
    private Button loginOutButton;

    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        auth = FirebaseAuth.getInstance();
        loginOutButton = findViewById(R.id.logOut);
        videoView =findViewById(R.id.video);

        MediaController mediaController = new MediaController(MainActivity.this);
        mediaController.setMediaPlayer(videoView);
        videoView.setMediaController(mediaController);

        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.welcome2));



        loginOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                auth.signOut();
                startActivity(new Intent(MainActivity.this, login.class));
            }
        });
    imageButton = (ImageButton) findViewById(R.id.msg);
    imageButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,activity_contact.class);
            startActivity(intent);
        }
    });
        imageButton = (ImageButton) findViewById(R.id.aboutus);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,aboutus.class);
                startActivity(intent);
            }
        });
        imageButton = (ImageButton) findViewById(R.id.map);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,product.class);
                startActivity(intent);
            }
       });}}

