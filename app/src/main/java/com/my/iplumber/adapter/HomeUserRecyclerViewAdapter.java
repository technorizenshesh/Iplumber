package com.my.iplumber.adapter;


import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.my.iplumber.MainActivity;
import com.my.iplumber.R;
import com.my.iplumber.act.PlumDetailsUserAct;
import com.my.iplumber.act.SelectPlumberLogin;
import com.my.iplumber.model.HomeModel;

import java.util.ArrayList;


public class HomeUserRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private Context mContext;
    private ArrayList<HomeModel> modelList;
    private OnItemClickListener mItemClickListener;


    public HomeUserRecyclerViewAdapter(Context context, ArrayList<HomeModel> modelList) {
        this.mContext = context;
        this.modelList = modelList;
    }

    public void updateList(ArrayList<HomeModel> modelList) {
        this.modelList = modelList;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_user_home, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        //Here you can fill your row view
        if (holder instanceof ViewHolder) {
            final HomeModel model = getItem(position);
            final ViewHolder genericViewHolder = (ViewHolder) holder;

            if(position==0)
            {
                genericViewHolder.txtAvailable.setVisibility(View.VISIBLE);


            }else
            {
                genericViewHolder.txtAvailable.setVisibility(View.GONE);
            }
            genericViewHolder.txtViewDetails.setOnClickListener(v -> {
                mContext.startActivity(new Intent(mContext, PlumDetailsUserAct.class));
            });

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {

                    genericViewHolder.txtAvailable.startAnimation(AnimationUtils.loadAnimation(mContext, R.anim.move_it));

                }
            }, 1000);



        }
    }

    @Override
    public int getItemCount() {

        return modelList.size();
    }

    public void SetOnItemClickListener(final OnItemClickListener mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }

    private HomeModel getItem(int position) {
        return modelList.get(position);
    }


    public interface OnItemClickListener {

        void onItemClick(View view, int position, HomeModel model);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

       TextView txtViewDetails;
       TextView txtAvailable;


        public ViewHolder(final View itemView) {
            super(itemView);

            txtViewDetails=itemView.findViewById(R.id.txtViewDetails);
            txtAvailable=itemView.findViewById(R.id.txtAvailable);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mItemClickListener.onItemClick(itemView, getAdapterPosition(), modelList.get(getAdapterPosition()));
                }
            });
        }
    }




}

