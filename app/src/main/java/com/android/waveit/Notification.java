package com.android.waveit;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Notification extends AppCompatActivity {

    AlertDialog.Builder builder;
    private ImageButton back5;
    private TextView leftnotification;
    private ImageButton noticegroup;
    private ImageButton changetampon1;
    private ImageButton changepad1;
    private ImageButton takecontracetive1;
    private ImageButton changetampon2;
    private ImageButton changepad2;
    private ImageButton takecontracetive2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        back5 = findViewById(R.id.back5);
        leftnotification = findViewById(R.id.leftnotificaion);
        noticegroup = findViewById(R.id.noticegroup);
        changetampon1 = findViewById(R.id.changetampon1);
        changepad1 = findViewById(R.id.changepad1);
        takecontracetive1 = findViewById(R.id.takecontracetive1);
        changetampon2 = findViewById(R.id.changetampon2);
        changepad2 = findViewById(R.id.changepad2);
        takecontracetive2 = findViewById(R.id.takecontracetive2);


        back5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });


        takecontracetive1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), eatcomplete.class);
                startActivity(intent);
                takecontracetive1.setBackgroundColor(Color.parseColor("#ffffff"));
                leftnotification.setText("0개 알림 남음");
            }
        });

        noticegroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });
    }

    public void showDialog() {
        final String[] notices = new String[] {"전체알림", "피임약", "생리대", "탐폰"};
        builder = new AlertDialog.Builder(Notification.this);
        builder.setTitle("보고 싶은 알림을 선택하세요");
        builder.setItems(
                notices, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                }
        );
    }
}