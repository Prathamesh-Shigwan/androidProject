package com.example.stree;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Item_adapter extends RecyclerView.Adapter<Item_adapter.ViewHolder> {
    Context context;
    ArrayList<Item_model> arrItems;

    Item_adapter(Context context, ArrayList<Item_model> arrItems){
        this.context = context;
        this.arrItems = arrItems;


    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.items_row,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imgItem.setImageResource(arrItems.get(position).image);
        holder.txtName.setText(arrItems.get(position).name);
        holder.txtId.setText(arrItems.get(position).id);
        holder.txtQuantity.setText(arrItems.get(position).quantity);
        holder.txtPrice.setText(arrItems.get(position).price);
        holder.txtValue.setText(arrItems.get(position).value);

    }

    @Override
    public int getItemCount() {
        return arrItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName,txtId,txtQuantity,txtPrice,txtValue;
        ImageView imgItem;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.tv_ItemName);
            txtId = itemView.findViewById(R.id.tv_Item_id);
            txtQuantity = itemView.findViewById(R.id.tv_item_quantity);
            txtPrice  = itemView.findViewById(R.id.tv_item_price);
            txtValue = itemView.findViewById(R.id.tv_item_value);
            imgItem = itemView.findViewById(R.id.item_img);

        }
    }
}
