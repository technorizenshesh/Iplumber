package com.my.iplumber.act;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.my.iplumber.R;
import com.my.iplumber.adapter.HomeUserRecyclerViewAdapter;
import com.my.iplumber.adapter.NotoficationRecyclerViewAdapter;
import com.my.iplumber.databinding.ActivityNotificationBinding;
import com.my.iplumber.model.HomeModel;

import java.util.ArrayList;

public class NotificationAct extends AppCompatActivity {

    ActivityNotificationBinding binding;

    private ArrayList<HomeModel> modelList = new ArrayList<>();
    NotoficationRecyclerViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_notification);

        setAdapter();

    }

    private void setAdapter() {

        this.modelList.add(new HomeModel("Corn"));
        this.modelList.add(new HomeModel("Tomotoes"));
        this.modelList.add(new HomeModel("Tomotoes"));
        this.modelList.add(new HomeModel("Tomotoes"));

        mAdapter = new NotoficationRecyclerViewAdapter(NotificationAct.this,modelList);
        binding.recyclerall.setHasFixedSize(true);
        binding.recyclerall.setLayoutManager(new LinearLayoutManager(NotificationAct.this));
        binding.recyclerall.setAdapter(mAdapter);

        mAdapter.SetOnItemClickListener(new NotoficationRecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position, HomeModel model) {

            }
        });
    }
}