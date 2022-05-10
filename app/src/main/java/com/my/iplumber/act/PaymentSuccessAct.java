package com.my.iplumber.act;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.my.iplumber.R;
import com.my.iplumber.VideoCallingAct;
import com.my.iplumber.databinding.ActivityPaymentScreenBinding;
import com.my.iplumber.databinding.ActivityPaymentSuccessBinding;

public class PaymentSuccessAct extends AppCompatActivity {

    ActivityPaymentSuccessBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_payment_success);

        binding.RRback.setOnClickListener(v -> {
            onBackPressed();
        });

        binding.RVideo.setOnClickListener(v -> {
            startActivity(new Intent(PaymentSuccessAct.this, VideoCallingAct.class));
            finish();
        });
    }
}