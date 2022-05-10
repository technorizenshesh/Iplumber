package com.my.iplumber;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.my.iplumber.act.SelectPlumberLogin;
import com.my.iplumber.databinding.ActivityMainBinding;

import javax.security.auth.login.LoginException;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        handlerMethod();
    }

    private void handlerMethod() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent=new Intent(MainActivity.this, SelectPlumberLogin.class);
                startActivity(intent);
                finish();

            }
        }, 3000);
    }

}