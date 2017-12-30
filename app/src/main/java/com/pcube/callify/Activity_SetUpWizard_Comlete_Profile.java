package com.pcube.callify;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Abhishek Punia on 20-12-2017.
 */

public class Activity_SetUpWizard_Comlete_Profile extends Activity implements View.OnClickListener {
    ImageView imgPaypal,imgSripe,imgCoinbase;
    Button btnChange,btnFinish;
    LinearLayout  paymentLayout;
    TextView tv_view;
    String Flagvalue = "1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setupwizard_complete_profile);
        btnChange = (Button)findViewById(R.id.btnChangee);
        btnFinish = (Button)findViewById(R.id.btnFinish);
        imgPaypal = (ImageView)findViewById(R.id.imgPaypal);
        imgSripe = (ImageView)findViewById(R.id.imgStripe);
        imgCoinbase = (ImageView)findViewById(R.id.imgCoinbase);
        paymentLayout = (LinearLayout) findViewById(R.id.paymentLayout);
        tv_view = (TextView)findViewById(R.id.tv_view);
        imgPaypal.setOnClickListener(this);
        imgSripe.setOnClickListener(this);
        imgCoinbase.setOnClickListener(this);
        btnChange.setOnClickListener(this);
        btnFinish.setOnClickListener(this);


        String value = getIntent().getStringExtra("value");

        if (value.equals("1")){
            paymentLayout.setVisibility(View.GONE);
            btnFinish.setBackgroundResource(R.drawable.button_background_skyblue);
            btnFinish.setEnabled(true);

        }
        else if (value.equals("2")){
            paymentLayout.setVisibility(View.VISIBLE);
            btnFinish.setBackgroundResource(R.drawable.button_background_light_skyblue);
            btnFinish.setEnabled(false);
        }
        else if (value.equals("3")){
            paymentLayout.setVisibility(View.VISIBLE);
            btnFinish.setBackgroundResource(R.drawable.button_background_light_skyblue);
            btnFinish.setEnabled(false);
        }


    }

    @Override
    public void onClick(View view) {
        if (view == imgPaypal){
            imgSripe.setVisibility(View.GONE);
            imgCoinbase.setVisibility(View.GONE);
            btnChange.setVisibility(View.VISIBLE);
            btnFinish.setBackgroundResource(R.drawable.button_background_skyblue);
            imgPaypal.setBackgroundResource(R.drawable.button_background_skyblue);
            btnFinish.setEnabled(true);
            tv_view.setVisibility(View.GONE);

        }
        else if(view == imgSripe){
            imgPaypal.setVisibility(View.GONE);
            imgCoinbase.setVisibility(View.GONE);
            btnChange.setVisibility(View.VISIBLE);
            btnFinish.setBackgroundResource(R.drawable.button_background_skyblue);
            btnFinish.setEnabled(true);
            tv_view.setVisibility(View.GONE);

        }
        else if (view == imgCoinbase){
            imgPaypal.setVisibility(View.GONE);
            imgSripe.setVisibility(View.GONE);
            btnChange.setVisibility(View.VISIBLE);
            btnFinish.setBackgroundResource(R.drawable.button_background_skyblue);
            btnFinish.setEnabled(true);
            tv_view.setVisibility(View.GONE);

        }
        else if (view == btnChange){
            imgPaypal.setVisibility(View.VISIBLE);
            imgSripe.setVisibility(View.VISIBLE);
            imgCoinbase.setVisibility(View.VISIBLE);
            btnFinish.setBackgroundResource(R.drawable.button_background_light_skyblue);
            imgPaypal.setImageResource(R.drawable.ic_paypal);
            imgPaypal.setBackgroundResource(R.drawable.button_border_gray);
            btnFinish.setEnabled(false);
            tv_view.setVisibility(View.VISIBLE);

        }

        else if (view == btnFinish ){
            Intent i = new Intent(Activity_SetUpWizard_Comlete_Profile.this,Activity_SetUpWizard_Suggested_Next_Step.class);
            startActivity(i);

        }

    }
}