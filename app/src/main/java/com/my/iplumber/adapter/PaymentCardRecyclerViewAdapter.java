package com.my.iplumber.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.my.iplumber.R;
import com.my.iplumber.model.HomeModel;
import com.my.iplumber.model.PaymentModel;

import java.util.ArrayList;


public class PaymentCardRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private Context mContext;
    private ArrayList<PaymentModel> modelList;
    private OnItemClickListener mItemClickListener;

     boolean isClick=false;
    public PaymentCardRecyclerViewAdapter(Context context, ArrayList<PaymentModel> modelList) {
        this.mContext = context;
        this.modelList = modelList;
    }

    public void updateList(ArrayList<PaymentModel> modelList) {
        this.modelList = modelList;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_payment_card, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        //Here you can fill your row view
        if (holder instanceof ViewHolder) {
            final PaymentModel model = getItem(position);
            final ViewHolder genericViewHolder = (ViewHolder) holder;

            genericViewHolder.txtmaster.setText(model.getName());
            genericViewHolder.img.setImageResource(model.getImg());

            genericViewHolder.RRCard.setOnClickListener(v -> {
                if(isClick)
                {
                    genericViewHolder.llAcDetails.setVisibility(View.GONE);
                    isClick=false;

                }else
                {
                    genericViewHolder.llAcDetails.setVisibility(View.VISIBLE);

                    isClick=true;
                }
            });

        }
    }
    @Override
    public int getItemCount() {

        return modelList.size();
    }

    public void SetOnItemClickListener(final OnItemClickListener mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }

    private PaymentModel getItem(int position) {
        return modelList.get(position);
    }


    public interface OnItemClickListener {

        void onItemClick(View view, int position, PaymentModel model);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtmaster;
        RelativeLayout RRCard;
        LinearLayout llAcDetails;
        ImageView img;

        public ViewHolder(final View itemView) {
            super(itemView);

            txtmaster=itemView.findViewById(R.id.txtmaster);
            RRCard=itemView.findViewById(R.id.RRCard);
            llAcDetails=itemView.findViewById(R.id.llAcDetails);
            img=itemView.findViewById(R.id.img);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    mItemClickListener.onItemClick(itemView, getAdapterPosition(), modelList.get(getAdapterPosition()));

                }
            });
        }
    }


}

