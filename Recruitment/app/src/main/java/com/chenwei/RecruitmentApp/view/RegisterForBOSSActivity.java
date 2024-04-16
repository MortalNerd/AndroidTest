package com.chenwei.RecruitmentApp.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.chenwei.RecruitmentApp.MainActivity;
import com.chenwei.RecruitmentApp.R;
import com.chenwei.RecruitmentApp.uti.Operator;

import java.util.ArrayList;
import java.util.List;

public class RegisterForBOSSActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnRegister,btnCancel;
    EditText editAccount,editPassword,editPhone,editCompany;
    List<EditText> editTextList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_for_bossactivity);

        initView();
    }

    private void initView() {
        btnCancel=findViewById(R.id.button_cancel);
        btnCancel.setOnClickListener(this);
        btnRegister=findViewById(R.id.button_register);
        btnRegister.setOnClickListener(this);
        editAccount=findViewById(R.id.editText_account);
        editPassword=findViewById(R.id.editText_password);
        editPhone=findViewById(R.id.editText_phone);
        editCompany=findViewById(R.id.editText_company);
        editTextList.add(editAccount);
        editTextList.add(editPhone);
        editTextList.add(editPhone);
        editTextList.add(editCompany);
    }


    @Override
    public void onClick(View v) {
        if (v.getId()==btnRegister.getId()){
            Operator.Register(v);
        } else if (v.getId()==btnCancel.getId()) {
            startActivity(new Intent(this, MainActivity.class));
        }

    }
}