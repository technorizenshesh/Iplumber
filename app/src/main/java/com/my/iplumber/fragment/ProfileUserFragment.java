package com.my.iplumber.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.my.iplumber.R;
import com.my.iplumber.act.SettingAct;
import com.my.iplumber.adapter.HomeUserRecyclerViewAdapter;
import com.my.iplumber.databinding.FragmentHomeProfileBinding;
import com.my.iplumber.databinding.FragmentHomeUserBinding;
import com.my.iplumber.model.HomeModel;

import java.util.ArrayList;

public class ProfileUserFragment extends Fragment {

    FragmentHomeProfileBinding binding;

    private ArrayList<HomeModel> modelList = new ArrayList<>();
    HomeUserRecyclerViewAdapter mAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home_profile, container, false);

        binding.txtSetting.setOnClickListener(v -> {
            startActivity(new Intent(getActivity(), SettingAct.class).putExtra("Type","User"));
        });

        return binding.getRoot();
    }

}