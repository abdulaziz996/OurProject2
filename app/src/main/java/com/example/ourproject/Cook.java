package com.example.ourproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Cook extends AppCompatActivity {
View view;
Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cook);

    }
    public void openProducts(View view) {
        startActivity(new Intent(this, product.class));
 }
public void openCake(View view){
        startActivity(new Intent(this, Cakeart.class));
}
    public void openLatte(View view) {
        startActivity(new Intent(this, LatteArt.class));

}public void openten(View view){
        startActivity(new Intent(this, ten.class));
    }
    public void opendraw(View view) {
        startActivity(new Intent(this, draw.class));

   }}