package com.my.iplumber.act;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.my.iplumber.R;
import com.my.iplumber.databinding.ActivityRateUserBinding;

public class RateUserAct extends AppCompatActivity {

    ActivityRateUserBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_rate_user);

        binding.RRback.setOnClickListener(v -> {
            onBackPressed();
        });
    }
}