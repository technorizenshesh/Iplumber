package com.my.iplumber;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.my.iplumber.act.RateUserAct;
import com.my.iplumber.databinding.ActivityVideoCallingBinding;

public class VideoCallingAct extends AppCompatActivity {

    ActivityVideoCallingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_video_calling);

        binding.RRvideo.setOnClickListener(v -> {
            startActivity(new Intent(VideoCallingAct.this, RateUserAct.class));
            finish();
        });
    }
}