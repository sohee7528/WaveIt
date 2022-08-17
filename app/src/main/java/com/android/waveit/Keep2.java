package com.android.waveit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Keep2 extends AppCompatActivity {

    ImageButton notice;
    ImageButton user;

    ImageButton whome;
    ImageButton wreal;
    ImageButton bkeep;
    ImageButton wproduct;
    ImageButton wcompany;

    ImageButton okay_product;
    ImageButton okay_company_brown;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keep2);



        okay_product=findViewById(R.id.okay_product);
        okay_company_brown = findViewById(R.id.okay_company_brown);

        okay_product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Keep.class);
                startActivity(intent);
                finish();
            }
        });

        okay_company_brown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Keep2.class);
                startActivity(intent);
                finish();
            }
        });

        //알림
        notice=findViewById(R.id.notice);
        notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Notification.class);
                startActivity(intent);
            }
        });

        user=findViewById(R.id.user);
        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),User.class);
                startActivity(intent);
            }
        });

        whome=findViewById(R.id.whome);
        wreal=findViewById(R.id.wreal);
        bkeep=findViewById(R.id.bkeep);
        wproduct=findViewById(R.id.wproduct);
        wcompany=findViewById(R.id.wcompany);

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

        bkeep.setOnClickListener(new View.OnClickListener() {
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

        wcompany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Company.class);
                startActivity(intent);
                finish();
            }
        });
    }
}