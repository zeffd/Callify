package com.pcube.callify;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.pcube.callify.R;

/**
 * Created by Abhishek Punia on 20-12-2017.
 */

public class Activity_SetUpWizard_Tracking_PhoneNo extends Activity {
     LinearLayout yesisonlineLayout;
     ImageView imgOnline;
     TextView tv_yes_online;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setupwizard_tracking_phone_no);
        yesisonlineLayout = (LinearLayout)findViewById(R.id.yesisonlineLayout);
        imgOnline = (ImageView)findViewById(R.id.imgOnline);
        tv_yes_online = (TextView)findViewById(R.id.tv_yes_online);

        yesisonlineLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == android.view.MotionEvent.ACTION_DOWN) {
                    imgOnline.setImageResource(R.drawable.vector_drawable_icon__world_blue);
                    tv_yes_online.setBackgroundResource(R.drawable.button_background_skyblue);
                    tv_yes_online.setText(R.string.yes_online);
                    tv_yes_online.setTextColor(getResources().getColor(R.color.colorWhite));
                } else if (motionEvent.getAction() == android.view.MotionEvent.ACTION_UP) {
                    tv_yes_online.setBackgroundResource(0);
                    imgOnline.setImageResource(R.drawable.vector_drawable_icon__world);
                    tv_yes_online.setText(R.string.yes_online);
                    tv_yes_online.setTextColor(getResources().getColor(R.color.colorGray));
                }

                return true;
            }
        });


    }

}