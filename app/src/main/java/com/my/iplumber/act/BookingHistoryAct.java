package com.my.iplumber.act;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.my.iplumber.R;
import com.my.iplumber.adapter.BookingRecyclerViewAdapter;
import com.my.iplumber.databinding.ActivityBookingHistoryBinding;
import com.my.iplumber.model.HomeModel;

import java.util.ArrayList;

public class BookingHistoryAct extends AppCompatActivity {

    BookingRecyclerViewAdapter mAdapter;
    private ArrayList<HomeModel> modelList = new ArrayList<>();

    ActivityBookingHistoryBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_booking_history);

        binding.RRback.setOnClickListener(v -> {
            onBackPressed();
        });

        setAdapter();

    }

  private void setAdapter() {

        this.modelList.add(new HomeModel("Corn"));
        this.modelList.add(new HomeModel("Tomotoes"));

        mAdapter = new BookingRecyclerViewAdapter(BookingHistoryAct.this,modelList);
        binding.recyclerall.setHasFixedSize(true);
        binding.recyclerall.setLayoutManager(new LinearLayoutManager(BookingHistoryAct.this));
        binding.recyclerall.setAdapter(mAdapter);

        mAdapter.SetOnItemClickListener(new BookingRecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position, HomeModel model) {

            }
        });
    }
}