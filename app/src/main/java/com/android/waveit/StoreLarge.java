package com.android.waveit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class StoreLarge extends AppCompatActivity {

    TextView btn_all;
    ImageButton tampon;

    ImageButton whome;
    ImageButton wreal;
    ImageButton wkeep;
    ImageButton bproduct;
    ImageButton wcompany;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_large);

        btn_all = findViewById(R.id.btn_all);
        btn_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),StoreMain.class);
                startActivity(intent);
            }
        });

        tampon = findViewById(R.id.tampon);
        tampon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),StoreTampon.class);
                startActivity(intent);
            }
        });


        whome=findViewById(R.id.whome);
        wreal=findViewById(R.id.wreal);
        wkeep=findViewById(R.id.wkeep);
        bproduct=findViewById(R.id.bproduct);
        wcompany=findViewById(R.id.wcompany);

        whome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        wreal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Information.class);
                startActivity(intent);
            }
        });

        wkeep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Keep.class);
                startActivity(intent);
            }
        });

        bproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),StoreMain.class);
                startActivity(intent);
                finish();
            }
        });

        wcompany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Company.class);
                startActivity(intent);
            }
        });
    }
}