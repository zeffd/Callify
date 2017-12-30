package com.pcube.callify;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * Created by Abhishek Punia on 20-12-2017.
 */

public class Activity_SetUpWizard_Suggested_Next_Step extends Activity implements View.OnClickListener{
    public TextView tvReviewNumber;
    public TextView tvNextStep;
    public LinearLayout reviewNumberLayout;
    public LinearLayout nextStepLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setupwizard_suggest_next_step);
        tvReviewNumber = (TextView)findViewById(R.id.tvReviewNumber);
        tvNextStep = (TextView)findViewById(R.id.tvNextStep);
        reviewNumberLayout = (LinearLayout)findViewById(R.id.reviewNumberLayout);
        nextStepLayout = (LinearLayout)findViewById(R.id.nextStepLayout);
        tvNextStep.setSelected(false);
        tvReviewNumber.setSelected(true);
        reviewNumberLayout.setVisibility(View.VISIBLE);
        nextStepLayout.setVisibility(View.GONE);
        tvReviewNumber.setTextColor(getResources().getColor(R.color.colorSkyBlue));
        tvNextStep.setTextColor(getResources().getColor(R.color.colorGray));
        tvNextStep.setOnClickListener(this);
        tvReviewNumber.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        if (view == tvReviewNumber){
            reviewNumberLayout.setVisibility(View.VISIBLE);
            nextStepLayout.setVisibility(View.GONE);
            tvNextStep.setSelected(false);
            tvReviewNumber.setSelected(true);
            tvReviewNumber.setTextColor(getResources().getColor(R.color.colorSkyBlue));
            tvNextStep.setTextColor(getResources().getColor(R.color.colorGray));

        }
        else if (view ==tvNextStep){
            nextStepLayout.setVisibility(View.VISIBLE);
            reviewNumberLayout.setVisibility(View.GONE);
            tvReviewNumber.setSelected(false);
            tvNextStep.setSelected(true);
            tvNextStep.setTextColor(getResources().getColor(R.color.colorSkyBlue));
            tvReviewNumber.setTextColor(getResources().getColor(R.color.colorGray));
        }

    }
}