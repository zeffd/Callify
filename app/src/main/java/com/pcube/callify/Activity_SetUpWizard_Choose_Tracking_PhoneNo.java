package com.pcube.callify;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Spinner;

import com.pcube.callify.Adapter.Choose_Tracking_Local_No_Adapter;
import com.pcube.callify.Adapter.Choose_Tracking_Tollfreel_No_Adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Abhishek Punia on 20-12-2017.
 */

public class Activity_SetUpWizard_Choose_Tracking_PhoneNo extends Activity {
    //LocalNumber;.....
    public RecyclerView recyclerView_LocalNumber;
    public Choose_Tracking_Local_No_Adapter choose_tracking_Local_no_adapter;
    public List<String> localNumberList =new ArrayList<String>();

    //Tollfree no...
    public RecyclerView recyclerView_tollFreeNo;
    public Choose_Tracking_Tollfreel_No_Adapter tracking_tollfree_no_adapter;
    public List<String> tollFreeNoList = new ArrayList<String>();

    public RelativeLayout areaCodeLayout;
    public Button btnAreaCode,btnChange,btnOtherOption;
    public Spinner SpnAreacode;
    private String[] arraySpinner = new String[]{"Enter area code,ZIP or State","790-456-9683","790-456-9683","790-456-9683","790-456-9683"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setupwizard_choose_tracking_phone_no);
        areaCodeLayout = (RelativeLayout)findViewById(R.id.areaCodeLayout);
        btnAreaCode = (Button)findViewById(R.id.btnAreaCode);
        SpnAreacode = (Spinner)findViewById(R.id.SpnAreacode);
        btnChange = (Button) findViewById(R.id.btnChange);
        btnOtherOption = (Button) findViewById(R.id.btnOtherOption);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        SpnAreacode.setAdapter(adapter);
        inItdisplay();
        btnAreaCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                areaCodeLayout.setVisibility(View.VISIBLE);
                btnAreaCode.setVisibility(View.GONE);


            }
        });




    }

    private void inItdisplay() {

        //recyclerView_LocalNumber....
        recyclerView_LocalNumber = (RecyclerView)findViewById(R.id.recyclerView_LocalNumber);

        recyclerView_LocalNumber.setHasFixedSize(true);
        choose_tracking_Local_no_adapter =new Choose_Tracking_Local_No_Adapter(this,localNumberList);
        recyclerView_LocalNumber.setAdapter(choose_tracking_Local_no_adapter);
        LinearLayoutManager llm_recent =new LinearLayoutManager(this);
        recyclerView_LocalNumber.setLayoutManager(llm_recent);

        localNumberList.add("790-456-9683");
        localNumberList.add("790-456-9683");
        localNumberList.add("790-456-96833");
        localNumberList.add("790-456-9683");
        localNumberList.add("790-456-9683");

        choose_tracking_Local_no_adapter.notifyDataSetChanged();
        recyclerView_LocalNumber.refreshDrawableState();
        recyclerView_LocalNumber.invalidate();

        //TollfreeNumber.......
        recyclerView_tollFreeNo = (RecyclerView)findViewById(R.id.recyclerView_tollfreeno);


        recyclerView_tollFreeNo.setHasFixedSize(true);
        tracking_tollfree_no_adapter =new Choose_Tracking_Tollfreel_No_Adapter(this,tollFreeNoList);
        recyclerView_tollFreeNo.setAdapter(tracking_tollfree_no_adapter);
        LinearLayoutManager llm_recentt =new LinearLayoutManager(this);
        recyclerView_tollFreeNo.setLayoutManager(llm_recentt);

        tollFreeNoList.add("790-456-9683");
        tollFreeNoList.add("790-456-9683");
        tollFreeNoList.add("790-456-9683");
        tollFreeNoList.add("790-456-9683");
        tollFreeNoList.add("790-456-9683");

    }

}