package com.android.waveit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;

public class SignUp_sickness extends AppCompatActivity {

    private ImageButton back_4;
    private CheckBox ScheckBox1;
    private CheckBox ScheckBox2;
    private CheckBox ScheckBox3;
    private CheckBox ScheckBox4;
    private CheckBox ScheckBox5;
    private CheckBox ScheckBox6;
    private CheckBox ScheckBox7;
    private CheckBox ScheckBox8;
    private Button skip2;
    private Button Next4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_disease);

        back_4 = findViewById(R.id.back_4);
        ScheckBox1 = findViewById(R.id.ScheckBox1);
        ScheckBox2 = findViewById(R.id.ScheckBox2);
        ScheckBox3 = findViewById(R.id.ScheckBox3);
        ScheckBox4 = findViewById(R.id.ScheckBox4);
        ScheckBox5 = findViewById(R.id.ScheckBox5);
        ScheckBox6 = findViewById(R.id.ScheckBox6);
        ScheckBox7 = findViewById(R.id.ScheckBox7);
        ScheckBox8 = findViewById(R.id.ScheckBox8);
        skip2 = findViewById(R.id.skip2);
        Next4 = findViewById(R.id.Next4);

        back_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SignUp_disease.class);
                startActivity(intent);
            }
        });

        skip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SignUp_complete.class);
                startActivity(intent);
            }
        });

        Next4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Next4.setClickable(false);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Next4.setClickable(false);
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (ScheckBox1.isChecked() || ScheckBox2.isChecked() || ScheckBox3.isChecked() || ScheckBox4.isChecked() || ScheckBox5.isChecked() || ScheckBox6.isChecked() || ScheckBox7.isChecked() || ScheckBox8.isChecked()) {
                    Next4.setClickable(true);
                    Next4.setBackgroundColor(Color.parseColor("#85776D"));
                    Next4.setTextColor(Color.parseColor("#ffffff"));
                }
            }
        });

        Next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SignUp_complete.class);
                startActivity(intent);
            }
        });
    }
}