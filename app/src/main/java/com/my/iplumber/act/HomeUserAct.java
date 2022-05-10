package com.my.iplumber.act;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;

import com.my.iplumber.R;
import com.my.iplumber.act.ui.home.HomeFragment;
import com.my.iplumber.databinding.ActivityHomeUserBinding;
import com.my.iplumber.fragment.HomeUserFragment;
import com.my.iplumber.fragment.ProfileUserFragment;

public class HomeUserAct extends AppCompatActivity {

    ActivityHomeUserBinding binding;
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_home_user);

        binding.llHOme.setOnClickListener(v -> {

            binding.imgHome.setImageResource(R.drawable.home_blue);
            binding.imgProfile.setImageResource(R.drawable.profile_gray);
            fragment = new HomeUserFragment();
            loadFragment(fragment);
        });

       binding.llProfile.setOnClickListener(v -> {

           binding.imgHome.setImageResource(R.drawable.home_gray);
           binding.imgProfile.setImageResource(R.drawable.profile_blue);

            fragment = new ProfileUserFragment();
            loadFragment(fragment);
        });

         binding.imgNotification.setOnClickListener(v -> {
          startActivity(new Intent(HomeUserAct.this,NotificationAct.class));
        });

        fragment = new HomeUserFragment();
        loadFragment(fragment);

    }


    public void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_homeshop, fragment);
        transaction.addToBackStack("home");
        transaction.commit();
    }

}