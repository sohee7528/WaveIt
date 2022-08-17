package com.android.waveit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class company_save extends AppCompatActivity {

    private ImageButton back6;
    private ImageButton movebrand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_save);

        back6 = findViewById(R.id.back6);
        movebrand = findViewById(R.id.move_brand);

        back6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Company.class);
                finish();
            }
        });
    }
}