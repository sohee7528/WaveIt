package com.android.waveit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Information extends AppCompatActivity {

    ImageButton whome;
    ImageButton breal;
    ImageButton wkeep;
    ImageButton wproduct;
    ImageButton wcompany;

    Button button;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        whome=findViewById(R.id.whome);
        breal=findViewById(R.id.breal);
        wkeep=findViewById(R.id.wkeep);
        wproduct=findViewById(R.id.wproduct);
        wcompany=findViewById(R.id.wcompany);

        button = findViewById(R.id.button);
        button1 = findViewById(R.id.button1);


        whome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        breal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Information.class);
                startActivity(intent);
                finish();
            }
        });

        wkeep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Information.class);
                startActivity(intent);
            }
        });

        wproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),StoreMain.class);
                startActivity(intent);
            }
        });

        wcompany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),StoreMain.class);
                startActivity(intent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Information_product.class);
                startActivity(intent);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Information_disease.class);
                startActivity(intent);
            }
        });

    }
}