package com.example.dashboardui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {


    List_data[] listData;

    public MyAdapter(List_data[] listData) {
        this.listData = listData;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View rowView =inflater.inflate(R.layout.custom_layout,parent,false);
        ViewHolder viewHolder = new ViewHolder(rowView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {

        final List_data list_data = listData[position];
        holder.titleMain.setText(list_data.getTitle());
        holder.priceTxt.setText(list_data.getPrice());
        holder.quntTxt.setText(list_data.getQuntity());
        holder.imageView.setImageResource(list_data.getImgId());



    }

    @Override
    public int getItemCount() {
        return listData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView titleMain, priceTxt, quntTxt;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            titleMain = itemView.findViewById(R.id.txt_title);
            priceTxt = itemView.findViewById(R.id.txt_amount);
            quntTxt = itemView.findViewById(R.id.txt_qun);
            imageView = itemView.findViewById(R.id.image_view);


        }
    }
}
