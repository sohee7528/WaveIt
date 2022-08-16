package com.android.waveit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    private EditText EditEmail;
    private EditText EditPWD;
    private Button FindID;
    private Button SignUp;
    private Button LogIn;
    private String emailValidation = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private String pwRegex = "^[a-zA-Z0-9]*$";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditEmail = findViewById(R.id.EditEmail);
        EditPWD = findViewById(R.id.EditPWD);
        FindID = findViewById(R.id.FindID);
        SignUp = findViewById(R.id.SignUp);
        LogIn = findViewById(R.id.LogIn);

        EditEmail.addTextChangedListener(loginTextWatcher);
        EditPWD.addTextChangedListener(loginTextWatcher);

        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), com.android.waveit.SignUp.class);
                startActivity(intent);
            }
        });

        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), com.android.waveit.MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private TextWatcher loginTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            String email = EditEmail.getText().toString().trim();
            String PWD = EditPWD.getText().toString().trim();
            if (email.matches(emailValidation) && PWD.matches(pwRegex) && EditPWD.length() > 5) {
                LogIn.setClickable(true);
                LogIn.setBackgroundColor(Color.parseColor("#85776D"));
            }
        }
    };
}