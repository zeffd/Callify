package com.pcube.callify.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import com.pcube.callify.R;

import java.util.List;


/**
 * Created by TIA on 12-08-2016.
 */

public class Add_Tracking_Number__Adapter extends RecyclerView.Adapter<Add_Tracking_Number__Adapter.ViewHolder> {
    Context context;
    List<String> rowItems;

    public Add_Tracking_Number__Adapter(Context context, List<String> rowItem) {
        this.context = context;
        this.rowItems = rowItem;
    }

    public List<String> getData() {
        return rowItems;
    }

    @Override
    public int getItemCount() {
        return rowItems.size();

    }

    @Override
    public int getItemViewType(int position) {
                return position;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.choose_tracking_local_number_list_row, parent, false));
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final String rowItem = rowItems.get(position);
        holder.tv_local_number.setText(rowItem);
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tv_local_number;
        RadioButton radioOne;

        ViewHolder(View convertView) {
            super(convertView);
            convertView.setOnClickListener(this);
            tv_local_number = (TextView) convertView.findViewById(R.id.tv_local_number);
            radioOne = (RadioButton)convertView.findViewById(R.id.radioOne);
        }
        @Override
        public void onClick(View v) {
        }
    }
}