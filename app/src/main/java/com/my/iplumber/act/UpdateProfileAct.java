package com.my.iplumber.act;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.my.iplumber.R;
import com.my.iplumber.databinding.ActivityUpdateProfileBinding;

public class UpdateProfileAct extends AppCompatActivity {

    ActivityUpdateProfileBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding= DataBindingUtil.setContentView(this,R.layout.activity_update_profile);

       binding.RRback.setOnClickListener(v -> {
           onBackPressed();
       });
    }
}