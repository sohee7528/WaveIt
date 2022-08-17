package com.android.waveit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Information_product extends AppCompatActivity {

    ImageButton backbutton;
    ImageButton tampon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information_product);

        backbutton = findViewById(R.id.backbutton);
        tampon=findViewById(R.id.tampon);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Information.class);
                finish();
            }
        });

        tampon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Information_product1.class);
                startActivity(intent);
                finish();
            }
        });

    }
}