package com.my.iplumber.act.ui.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.my.iplumber.R;
import com.my.iplumber.act.SettingAct;
import com.my.iplumber.databinding.FragmentNotificationsBinding;


public class NotificationsFragment extends Fragment {

    private FragmentNotificationsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_notifications, container, false);

        binding.txtSetting.setOnClickListener(v -> {
            startActivity(new Intent(getActivity(), SettingAct.class).putExtra("Type","PLumber"));
        });
        return binding.getRoot();
    }

}