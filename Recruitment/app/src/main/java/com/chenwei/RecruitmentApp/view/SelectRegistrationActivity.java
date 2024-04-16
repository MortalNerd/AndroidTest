package com.chenwei.RecruitmentApp.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.chenwei.RecruitmentApp.R;
import com.chenwei.RecruitmentApp.uti.Operator;

//该活动实现跳转到不同身份的注册页面
public class SelectRegistrationActivity extends AppCompatActivity implements View.OnClickListener{


    //控件预览
    Button btnToBoss,btnToHR,btnToApplicant,btnCancel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_registeration);
        //初始化
        initView();
    }

    private void initView() {
        btnToBoss=findViewById(R.id.button_to_boss);
        btnToBoss.setOnClickListener(this);

        btnToHR=findViewById(R.id.button_to_hr);
        btnToHR.setOnClickListener(this);

        btnToApplicant=findViewById(R.id.button_to_applicant);
        btnToApplicant.setOnClickListener(this);

        btnCancel=findViewById(R.id.button_cancel);
        btnCancel.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent=Operator.getIntent(v);
        if (intent!=null){
            startActivity(intent);
        }
    }
}