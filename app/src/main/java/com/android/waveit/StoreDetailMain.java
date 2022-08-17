package com.android.waveit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import me.relex.circleindicator.CircleIndicator3;

public class StoreDetailMain extends AppCompatActivity {

    ImageButton norecommand;
    ImageButton arrow;
    ImageButton judge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_detail_main);

        norecommand = findViewById(R.id.norecommand);
        norecommand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),StoreDetailMain2.class);
                startActivity(intent);
            }
        });

        arrow = findViewById(R.id.arrow);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),StoreMain.class);
                startActivity(intent);
            }
        });

        judge = findViewById(R.id.judge);
        judge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),StoreJudge.class);
                startActivity(intent);
            }
        });
    }
}