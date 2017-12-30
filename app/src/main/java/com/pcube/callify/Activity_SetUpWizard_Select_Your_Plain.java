package com.pcube.callify;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Abhishek Punia on 20-12-2017.
 */

public class Activity_SetUpWizard_Select_Your_Plain extends Activity implements View.OnClickListener{
    public Button selectBasic;
    public Button selectPlus;
    public Button seldectPro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setupwizard_select_your_plain);
        selectBasic = (Button)findViewById(R.id.select_basic);
        selectPlus = (Button)findViewById(R.id.select_plus);
        seldectPro = (Button)findViewById(R.id.select_pro);
        selectBasic.setOnClickListener(this);
        selectPlus.setOnClickListener(this);
        seldectPro.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == selectBasic){
             Intent i = new Intent(Activity_SetUpWizard_Select_Your_Plain.this,Activity_SetUpWizard_Comlete_Profile.class);
             i.putExtra("value","1");
             startActivity(i);
        }
        else if (view == selectPlus) {
            Intent i = new Intent(Activity_SetUpWizard_Select_Your_Plain.this, Activity_SetUpWizard_Comlete_Profile.class);
            i.putExtra("value", "2");
            startActivity(i);
        }


        else if (view == seldectPro){
            Intent i = new Intent(Activity_SetUpWizard_Select_Your_Plain.this, Activity_SetUpWizard_Comlete_Profile.class);
            i.putExtra("value", "3");
            startActivity(i);
        }

    }
}