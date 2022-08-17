package com.android.waveit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Company extends AppCompatActivity {

    private ImageButton c_save;
    private ImageButton c_justmyday;
    private ImageButton c_happymoonday;

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
    }
}