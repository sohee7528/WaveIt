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
import android.widget.EditText;
import android.widget.ImageButton;

public class SignUp extends AppCompatActivity {

    private ImageButton back1;
    private EditText sEditEmail;
    private EditText EditNname;
    private CheckBox allcheck;
    private CheckBox check1;
    private CheckBox check2;
    private Button Next1;
    private String emailValidation = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        back1 = findViewById(R.id.back1);
        sEditEmail = findViewById(R.id.sEditEmail);
        EditNname = findViewById(R.id.EditNname);
        allcheck = findViewById(R.id.allcheck);
        check1 = findViewById(R.id.check1);
        check2 = findViewById(R.id.check2);
        Next1 = findViewById(R.id.Next1);

        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
            }
        });

        Next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SignUp_pwd.class);
                startActivity(intent);
            }
        });

        allcheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (allcheck.isChecked()) {
                    check1.isChecked();
                    check2.isChecked();
                }
            }
        });

        check1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check1.isChecked();
            }
        });

        check2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check2.isChecked();
                if (check1.isChecked() && check2.isChecked()){
                    allcheck.isChecked();
                }
            }
        });

        sEditEmail.addTextChangedListener(Next1TextWatcher);
        EditNname.addTextChangedListener(Next1TextWatcher);
    }

    private TextWatcher Next1TextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        //이메일이 emailvalidation에 맞고 닉네임이 1자 이상이면 Next1 버튼 활성화, 색 바뀜
        @Override
        public void afterTextChanged(Editable s) {
            String email = sEditEmail.getText().toString().trim();
            String PWD = EditNname.getText().toString().trim();
            if (email.matches(emailValidation) && EditNname.length()>0 && allcheck.isChecked()){
                Next1.setClickable(true);
                Next1.setBackgroundColor(Color.parseColor("#85776D"));
            }

        }
    };
}