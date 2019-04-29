package com.ringobee.bodydiary.Login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.ringobee.bodydiary.R;

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

        
        //처음에 비밀번호 저장을 했는지 판단
        SharedPreferences sf = getSharedPreferences("first_pw",MODE_PRIVATE);
        boolean first_pw_save =sf.getBoolean("first_pw",false);

        if(first_pw_save){ // 사용자가 처음에 비밀번호를 저장했다면
            super.onCreate(savedInstanceState);
            setContentView(R.layout.login_activity);

            LoginInput = findViewById(R.id.input_pw);
            AutoLogin = (CheckBox)findViewById(R.id.auto_login);
            Login = (Button)findViewById(R.id.login);
            FingerLogin = (Button)findViewById(R.id.finger_login);
            ResetPw = findViewById(R.id.reset_pw);

            LoginInput.setOnClickListener(this);
            AutoLogin.setOnClickListener(this);
            Login.setOnClickListener(this);
            FingerLogin.setOnClickListener(this);
            ResetPw.setOnClickListener(this);
        }else{ // 처음 비밀번호 설정 x
            Intent i = new Intent(this, ResetPw.class);
            startActivity(i);
        }


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.auto_login:
                break;
            case R.id.login:
//                Intent i = new Intent();
                break;
            case R.id.finger_login:
                break;
            case R.id.reset_pw:
                break;
        }
    }
}
