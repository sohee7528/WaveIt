package com.android.waveit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class StoreJudge extends AppCompatActivity {

    ImageButton question1;
    ImageButton question2;
    ImageButton question3;
    ImageButton question4;
    ImageButton question5;
    ImageButton question6;
    ImageButton complete;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_judge);

        question1 = findViewById(R.id.question1);
        question1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                question1.setImageResource(R.drawable.answer1);
            }
        });

        question2 = findViewById(R.id.question2);
        question2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                question2.setImageResource(R.drawable.answer2);
            }
        });

        question3 = findViewById(R.id.question3);
        question3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                question3.setImageResource(R.drawable.answer3);
            }
        });

        question4 = findViewById(R.id.question4);
        question4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                question4.setImageResource(R.drawable.answer4);
            }
        });

        question5 = findViewById(R.id.question5);
        question5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                question5.setImageResource(R.drawable.answer5);
            }
        });

        question6 = findViewById(R.id.question6);
        question6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                question6.setImageResource(R.drawable.answer6);
            }
        });


        complete = findViewById(R.id.complete);
        complete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),StoreDetailMain.class);
                startActivity(intent);
            }
        });



    }
}