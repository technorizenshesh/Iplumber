package com.my.iplumber.act;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.my.iplumber.R;
import com.my.iplumber.databinding.ActivityPlumDetailsUserBinding;

public class PlumDetailsUserAct extends AppCompatActivity {

    ActivityPlumDetailsUserBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_plum_details_user);

        binding.imgBack.setOnClickListener(v -> {
            onBackPressed();
        });

        binding.RBook.setOnClickListener(v -> {
           startActivity(new Intent(PlumDetailsUserAct.this,PaymentScreenAct.class));
        });

    }
}