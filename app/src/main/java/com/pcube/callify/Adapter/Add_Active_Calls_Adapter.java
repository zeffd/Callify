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

public class Add_Active_Calls_Adapter extends RecyclerView.Adapter<Add_Active_Calls_Adapter.ViewHolder> {
    Context context;
    private List<BeanNameCont> rowItems;

    public Add_Active_Calls_Adapter(Context context, List<BeanNameCont> rowItems) {
        this.context = context;
        this.rowItems = rowItems;
    }

    public List<BeanNameCont> getData() {
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
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.active_calls_row, parent, false));
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final BeanNameCont rowItem = rowItems.get(position);
        holder.callerName.setText(rowItem.getName());
        holder.callerNumber.setText(rowItem.getNumber());
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView callerName, callerNumber;

        ViewHolder(View convertView) {
            super(convertView);
            convertView.setOnClickListener(this);
            callerName = convertView.findViewById(R.id.callerName);
            callerNumber = convertView.findViewById(R.id.callerNumber);
        }
        @Override
        public void onClick(View v) {
        }
    }
}