package com.my.iplumber.act;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.my.iplumber.R;
import com.my.iplumber.adapter.BookingRecyclerViewAdapter;
import com.my.iplumber.adapter.PaymentCardRecyclerViewAdapter;
import com.my.iplumber.databinding.ActivityPaymentScreenBinding;
import com.my.iplumber.model.HomeModel;
import com.my.iplumber.model.PaymentModel;

import java.util.ArrayList;

public class PaymentScreenAct extends AppCompatActivity {

    ActivityPaymentScreenBinding binding;
    PaymentCardRecyclerViewAdapter mAdapter;
    private ArrayList<PaymentModel> modelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_payment_screen);

        setAdapter();

        binding.RBook.setOnClickListener(v -> {
            startActivity(new Intent(PaymentScreenAct.this,PaymentSuccessAct.class));

        });

    }

    private void setAdapter() {

        this.modelList.add(new PaymentModel("Master Card",R.drawable.master_card));
        this.modelList.add(new PaymentModel("Visa Card",R.drawable.visa));
        this.modelList.add(new PaymentModel("Master Card",R.drawable.master_card));


        mAdapter = new PaymentCardRecyclerViewAdapter(PaymentScreenAct.this,modelList);
        binding.recyclePaymentCart.setHasFixedSize(true);
        binding.recyclePaymentCart.setLayoutManager(new LinearLayoutManager(PaymentScreenAct.this));
        binding.recyclePaymentCart.setAdapter(mAdapter);

        mAdapter.SetOnItemClickListener(new PaymentCardRecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position, PaymentModel model) {

            }
        });
    }
}