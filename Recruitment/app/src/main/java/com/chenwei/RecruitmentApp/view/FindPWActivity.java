package com.chenwei.RecruitmentApp.view;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.chenwei.RecruitmentApp.MainActivity;
import com.chenwei.RecruitmentApp.R;

public class FindPWActivity extends AppCompatActivity implements View.OnClickListener{

    //控件
    Button btnQuery,btnCancel;
    Spinner spinnerIdentity;
    EditText editAccount,editPhone;
    TextView txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_pwactivity);
        //绑定控件
        initView();

    }


    //初始化
    private void initView() {
        btnQuery=findViewById(R.id.button_query);
        btnQuery.setOnClickListener(this);

        btnCancel=findViewById(R.id.button_cancel);
        btnCancel.setOnClickListener(this);

        spinnerIdentity=findViewById(R.id.spinner_identity);
        editAccount=findViewById(R.id.editText_account);
        editPhone=findViewById(R.id.editText_phone);
    }


    //鼠标点击事件
    @Override
    public void onClick(View v) {
        if (v.getId()==btnQuery.getId()){
            check();

        } else if (v.getId()==btnCancel.getId()) {
            Intent intent = new Intent(FindPWActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }

    }



    //查询的方法，待完成
    private void check() {
        Log.d("find","点击了按键");
    }



}