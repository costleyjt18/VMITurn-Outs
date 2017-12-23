package com.costley.jordan.vmiturn_outs;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Jordan on 12/21/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<List_Item> listItems;
    private Context context;

    public MyAdapter(List<List_Item> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        List_Item listItem = listItems.get(position);

        holder.TextViewHead.setText(listItem.getHead());
        holder.TextViewDesc.setText(listItem.getDesc());
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView TextViewHead;
        public TextView TextViewDesc;

        public ViewHolder(View itemView) {
            super(itemView);

            TextViewHead = (TextView) itemView.findViewById(R.id.textViewHead);
            TextViewDesc = (TextView) itemView.findViewById(R.id.textViewDesc);
        }
    }
}