package com.ringobee.bodydiary.Login;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.ringobee.bodydiary.R;

public class ResetPw extends AppCompatActivity implements View.OnClickListener {

    private EditText NowPw;
    private EditText NewPw;
    private EditText NewPwId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_pw);

        NowPw = findViewById(R.id.now_pw);
        NewPw = findViewById(R.id.new_pw);
        NewPwId = findViewById(R.id.new_pw_id);

        NowPw.setOnClickListener(this);
        NewPw.setOnClickListener(this);
        NewPwId.setOnClickListener(this);


        //비밀번호 일치 검사
        NewPwId.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            //틀리면 색변화.
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String ed_pw = NewPw.getText().toString();
                String ed_pw1= NewPwId.getText().toString();

                if(ed_pw.equals(ed_pw1)){
                    TextView a =findViewById(R.id.ox);
                    a.setText("비밀 번호가 일치 합니다.");
                    a.setBackgroundColor(Color.GREEN);
                }else{
                    TextView  a =findViewById(R.id.ox);
                    a.setText("비밀 번호가 일치 하지 않습니다.");
                    a.setBackgroundColor(Color.RED);
                }
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });



    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.now_pw:
                break;
            case R.id.new_pw:
                break;
            case R.id.new_pw_id:
                break;
        }
    }
}
