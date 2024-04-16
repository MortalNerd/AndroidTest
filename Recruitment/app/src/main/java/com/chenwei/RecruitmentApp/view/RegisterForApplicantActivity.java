package com.chenwei.RecruitmentApp.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.chenwei.RecruitmentApp.MainActivity;
import com.chenwei.RecruitmentApp.R;
import com.chenwei.RecruitmentApp.uti.Operator;

public class RegisterForApplicantActivity extends AppCompatActivity implements View.OnClickListener{

    //控件
    Button btnRegister,btnCancel;
    EditText editAccount,editPassword,editPhone,editSchool,editMajor;
    Spinner spinnerDegree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_for_applicant);

        initView();
    }

    //初始化
    private void initView() {
        btnCancel=findViewById(R.id.button_cancel);
        btnCancel.setOnClickListener(this);

        btnRegister=findViewById(R.id.button_register);
        btnRegister.setOnClickListener(this);

        editAccount=findViewById(R.id.editText_account);
        editPassword=findViewById(R.id.editText_password);
        editPhone=findViewById(R.id.editText_phone);
        editSchool=findViewById(R.id.editText_school);
        editMajor=findViewById(R.id.editText_major);
        spinnerDegree=findViewById(R.id.spinner_degree);
    }

    //监听按键
    @Override
    public void onClick(View v) {

        if (v.getId()==btnRegister.getId()){
            Operator.Register(v);
        } else if (v.getId()==btnCancel.getId()) {
            startActivity(new Intent(this, MainActivity.class));
        }

    }



}