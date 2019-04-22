package com.ringobee.bodydiary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity implements View.OnClickListener {


    private EditText LoginInput;
    private CheckBox AutoLogin;
    private Button Login;
    private Button FingerLogin;
    private TextView ResetPw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        LoginInput = findViewById(R.id.input_pw);
        AutoLogin = findViewById(R.id.auto_login);
        Login = findViewById(R.id.login);
        FingerLogin = findViewById(R.id.finger_login);
        ResetPw = findViewById(R.id.reset_pw);

//        LoginInput.setOnClickListener(this);
        AutoLogin.setOnClickListener(this);
        Login.setOnClickListener(this);
        FingerLogin.setOnClickListener(this);
        ResetPw.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.auto_login:
                break;
            case R.id.login:
                Intent i = new Intent();
                break;
            case R.id.finger_login:
                break;
            case R.id.reset_pw:
                break;
        }
    }
}
