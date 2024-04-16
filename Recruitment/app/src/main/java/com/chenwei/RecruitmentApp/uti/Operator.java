package com.chenwei.RecruitmentApp.uti;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.chenwei.RecruitmentApp.MainActivity;
import com.chenwei.RecruitmentApp.R;
import com.chenwei.RecruitmentApp.view.FindPWActivity;
import com.chenwei.RecruitmentApp.view.RegisterForApplicantActivity;
import com.chenwei.RecruitmentApp.view.RegisterForBOSSActivity;
import com.chenwei.RecruitmentApp.view.RegisterForHRActivity;
import com.chenwei.RecruitmentApp.view.SelectRegistrationActivity;

import java.util.List;

public final class Operator {

    //每次调用该类时，初始化按键
    /*    private final int btnCancel=R.id.button_cancel,
            btnRegister=R.id.button_register,
            btnFind = R.id.button_find,
            btnToBOSS=R.id.button_to_boss;*/



    //在注册和登录的情况下，判断按键要跳转哪那些页面
    //Button对应活动关系
    //cancel->MainActivity
    //find->FindPWActivity
    //register->SelectRegistrationActivity
    //button_to_boss->RegisterForBossActivity
    //....
    public static Intent getIntent(View v) {

        Intent intent = null;
        int i = v.getId();
        Context c = v.getContext();

        if (i == R.id.button_cancel) {
            intent = new Intent(c, MainActivity.class);
        } else if (i == R.id.button_find) {
            intent = new Intent(c, FindPWActivity.class);
        } else if (i == R.id.button_register) {
            intent = new Intent(c, SelectRegistrationActivity.class);
        } else if (i == R.id.button_to_boss) {
            intent = new Intent(c, RegisterForBOSSActivity.class);
        } else if (i == R.id.button_to_hr){
            intent = new Intent(c, RegisterForHRActivity.class);
        }else if (i==R.id.button_to_applicant){
            intent = new Intent(c, RegisterForApplicantActivity.class);
        }
            return intent;
    }


    //实现用户注册，本身是按键监听，要么跳转活动，要么注册用户.
    public static void Register(View v) {

        int i = v.getId();
        if (i==R.id.button_cancel){
            Intent intent = new Intent(v.getContext(), MainActivity.class);

        } else if (i==R.id.button_register) {

        }

    }
}
