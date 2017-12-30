package com.pcube.callify.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.pcube.callify.R;


/**
 * Created by TIA on 11-08-2016.
 */

public class Fragment_Aboutus extends Fragment {
    TextView textview1;
    ImageButton btn_NavIcon,imgtitle,imgProfile;
    Spinner spinnImgeProfile;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_edit_numbers,container, false);

      /*  textview1 = (TextView)view.findViewById(R.id.textView);
        btn_NavIcon = (ImageButton)view.findViewById(R.id.btn_NavIcon);
        imgtitle = (ImageButton)view.findViewById(R.id.imgtitle);
        imgProfile = (ImageButton)view.findViewById(R.id.imgProfile);
        spinnImgeProfile = (Spinner)view.findViewById(R.id.spinnImgProfile);
        btn_NavIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawer.openDrawer(Gravity.LEFT);
            }
        });

        textview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/


         return view;
    }

}
