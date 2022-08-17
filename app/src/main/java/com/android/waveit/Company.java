package com.android.waveit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Company extends AppCompatActivity {

    ImageButton c_save;
    ImageButton c_justmyday;
    ImageButton c_happymoonday;

    ImageButton whome;
    ImageButton wreal;
    ImageButton wkeep;
    ImageButton wproduct;
    ImageButton bcompany;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company);

        c_save = findViewById(R.id.c_save);
        c_justmyday = findViewById(R.id.c_justmyday);
        c_happymoonday = findViewById(R.id.c_happymoonday);

        c_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), company_save.class);
                startActivity(intent);
            }
        });

        c_happymoonday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), company_happymoon.class);
                startActivity(intent);
            }
        });

        c_justmyday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), company_justmy.class);
                startActivity(intent);
            }
        });


        whome=findViewById(R.id.whome);
        wreal=findViewById(R.id.wreal);
        wkeep=findViewById(R.id.wkeep);
        wproduct=findViewById(R.id.wproduct);
        bcompany=findViewById(R.id.bcompany);

        whome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        wreal.setOnClickListener(new View.OnClickListener() {
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
                Intent intent=new Intent(getApplicationContext(),Keep.class);
                startActivity(intent);
                finish();
            }
        });

        wproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),StoreMain.class);
                startActivity(intent);
                finish();
            }
        });

        bcompany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Company.class);
                startActivity(intent);
                finish();
            }
        });

    }
}