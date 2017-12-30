package com.pcube.callify.Fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.pcube.callify.Adapter.Add_Active_Calls_Adapter;
import com.pcube.callify.Adapter.Add_Recent_Calls_Adapter;
import com.pcube.callify.Adapter.BeanNameCont;
import com.pcube.callify.R;

import java.util.ArrayList;
import java.util.List;

public class frag_LeadCenter_Lead extends Fragment {

    Button calls, texts;
    RecyclerView activeCalls, recentCalls;
    Add_Active_Calls_Adapter active_calls_adapter;
    Add_Recent_Calls_Adapter recent_calls_adapter;
    List<BeanNameCont> rowData;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lead_center_lead, container, false);

        calls = view.findViewById(R.id.calls);
        texts = view.findViewById(R.id.texts);
        activeCalls = view.findViewById(R.id.activeCalls);
        recentCalls = view.findViewById(R.id.recentCalls);

        rowData = new ArrayList<>();
        rowData.add(new BeanNameCont("Union, IL", "815-923-9800"));
        rowData.add(new BeanNameCont("Port Rodgerborough", "965-328-9778"));
        active_calls_adapter = new Add_Active_Calls_Adapter(getContext(), rowData);
        recent_calls_adapter = new Add_Recent_Calls_Adapter(getContext(), rowData);

        activeCalls.setAdapter(active_calls_adapter);
        recentCalls.setAdapter(recent_calls_adapter);



        calls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calls.setTextColor(getResources().getColor(R.color.colorWhite));
                calls.setBackgroundColor(getResources().getColor(R.color.colorSkyBlue));

                texts.setTextColor(getResources().getColor(R.color.colorSkyBlue));
                texts.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            }
        });

        texts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calls.setTextColor(getResources().getColor(R.color.colorSkyBlue));
                calls.setBackgroundColor(getResources().getColor(R.color.colorWhite));

                texts.setTextColor(getResources().getColor(R.color.colorWhite));
                texts.setBackgroundColor(getResources().getColor(R.color.colorSkyBlue));

            }
        });

        return view;
    }
}
