package com.android.waveit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class SignUp_pwd extends AppCompatActivity {

    private ImageButton back2;
    private EditText sEditPWD;
    private Button Next2;
    private String pwRegex = "^[a-zA-Z0-9]*$";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_pwd);

        back2 = findViewById(R.id.back2);
        sEditPWD = findViewById(R.id.sEditPWD);
        Next2 = findViewById(R.id.Next2);

        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp_pwd.this, SignUp.class);
            }
        });

        Next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp_pwd.this, SignUp_disease.class);
            }
        });
    }
}