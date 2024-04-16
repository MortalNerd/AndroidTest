package com.chenwei.RecruitmentApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.chenwei.RecruitmentApp.uti.Operator;
import com.chenwei.RecruitmentApp.view.FindPWActivity;
import com.chenwei.RecruitmentApp.view.HomePageActivity;
import com.chenwei.RecruitmentApp.view.SelectRegistrationActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    //控件预览
    EditText edtPassword,edtPhone;
    CheckBox chkDisplayPW;
    Button btnRegister,btnLogin,btnFindPW;
    Spinner spinnerIdentity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //控件初始化
        initView();

        //调用checkbox监听器方法,判断是否显示密码
        listenToChk(chkDisplayPW,edtPassword);

    }




    //设置checkbox监听器
    private void listenToChk(CheckBox checkBox,EditText password) {
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    password.setSelection(password.getText().toString().length());
                }else {
                    Log.d("MAIN","false");
                    password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    password.setSelection(password.getText().toString().length());
                }
            }
        });
    }



    //绑定控件
    private void initView() {
        edtPassword = findViewById(R.id.editText_password);
        edtPhone = findViewById(R.id.editText_phone);
        chkDisplayPW = findViewById(R.id.checkbox__login_displaypw);

        btnLogin = findViewById(R.id.button_login);
        btnLogin.setOnClickListener(this);

        //btnLogin=Operator.initButton(R.id.button_login,this)
        //我想改成这样,用一个工具类Operator，但是不理解FindViewbyID

        btnFindPW =findViewById(R.id.button_find);
        btnFindPW.setOnClickListener(this);

        btnRegister =findViewById(R.id.button_register);
        btnRegister.setOnClickListener(this);

        spinnerIdentity  = findViewById(R.id.spinner_identity);
    }


    //设置鼠标监听事件,观察是否要跳转活动，
    @Override
    public void onClick(View v) {
        Intent intent = Operator.getIntent(v);
        if(intent!=null){
            startActivity(intent);
        }
    }




}