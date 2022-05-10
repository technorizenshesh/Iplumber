package com.my.iplumber.act;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.my.iplumber.R;
import com.my.iplumber.databinding.ActivitySettingBinding;

public class SettingAct extends AppCompatActivity {

    ActivitySettingBinding binding;
    String Type="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding= DataBindingUtil.setContentView(this,R.layout.activity_setting);

       Intent intent=getIntent();
       if(intent!=null)
       {
            Type=intent.getStringExtra("").toString();

           if(Type.equalsIgnoreCase("PLumber"))
           {
               binding.cardHistory.setVisibility(View.GONE);
           }else
           {
               binding.cardHistory.setVisibility(View.VISIBLE);
           }
       }



       binding.RRback.setOnClickListener(v -> {
           onBackPressed();
       });

       binding.txtUpdate.setOnClickListener(v -> {

         startActivity(new Intent(SettingAct.this,UpdateProfileAct.class));

       });

       binding.txtChange.setOnClickListener(v -> {

         startActivity(new Intent(SettingAct.this,ChangePasswordAct.class));

       });

       binding.txtBooking.setOnClickListener(v -> {

         startActivity(new Intent(SettingAct.this,BookingHistoryAct.class));

       });
    }
}