package com.my.iplumber.act;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.my.iplumber.R;
import com.my.iplumber.databinding.ActivityLoginBinding;

public class LoginAct extends AppCompatActivity {

    ActivityLoginBinding binding;
    String Type="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_login);

        Intent intent=getIntent();

        if(intent!=null)
        {
            Type=intent.getStringExtra("type").toString();
        }

        binding.llCreate.setOnClickListener(v -> {

            if(Type.equalsIgnoreCase("plumber"))
            {
                startActivity(new Intent(LoginAct.this, SignUpPlumberAct.class));

            }else if(Type.equalsIgnoreCase("user"))
            {
                startActivity(new Intent(LoginAct.this, SignUpUserAct.class));

            }
        });

    binding.RLogin.setOnClickListener(v -> {

            if(Type.equalsIgnoreCase("plumber"))
            {
                startActivity(new Intent(LoginAct.this, HomePlumberAct.class));

            }else if(Type.equalsIgnoreCase("user"))
            {
                startActivity(new Intent(LoginAct.this, HomeUserAct.class));

            }
        });

        binding.txtForogot.setOnClickListener(v -> {

            startActivity(new Intent(LoginAct.this,ForgotAct.class));

        });


    }
}