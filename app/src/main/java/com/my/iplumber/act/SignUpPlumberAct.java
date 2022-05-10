package com.my.iplumber.act;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.my.iplumber.R;
import com.my.iplumber.databinding.ActivityPlumberSignUpBinding;
import com.my.iplumber.databinding.ActivityPlumberUserSignUpBinding;

public class SignUpPlumberAct extends AppCompatActivity {

    ActivityPlumberSignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_plumber_sign_up);

        binding.llLogin.setOnClickListener(v -> {
            startActivity(new Intent(SignUpPlumberAct.this,LoginAct.class).putExtra("",""));
        });
    }
}