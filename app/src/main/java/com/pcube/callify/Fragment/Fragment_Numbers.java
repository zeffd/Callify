package com.pcube.callify.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.pcube.callify.Adapter.Add_Tracking_Number__Adapter;
import com.pcube.callify.Adapter.Choose_Tracking_Local_No_Adapter;
import com.pcube.callify.R;

import java.util.ArrayList;

import static com.pcube.callify.MainActivity.drawer;


/**
 * Created by TIA on 11-08-2016.
 */

public class Fragment_Numbers extends Fragment {
    public RecyclerView rvAddTrackginNumber;
    public Add_Tracking_Number__Adapter add_tracking_number__adapter;
    public ImageButton btn_NavIcon,imgtitle,imgProfile;
    public Spinner spinnImgeProfile;
    public ArrayList<String> addTrackingNumList = new ArrayList<String >();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_numbers,container, false);
        btn_NavIcon = (ImageButton)view.findViewById(R.id.btn_NavIcon);
        imgtitle = (ImageButton)view.findViewById(R.id.imgtitle);
        imgProfile = (ImageButton)view.findViewById(R.id.imgProfile);

        btn_NavIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawer.openDrawer(Gravity.LEFT);
            }
        });
        inItdisplay(view);

         return view;
    }

    private void inItdisplay(View view) {
        rvAddTrackginNumber = (RecyclerView)view.findViewById(R.id.rvTrackginNumber);

        rvAddTrackginNumber.setHasFixedSize(true);
        add_tracking_number__adapter =new Add_Tracking_Number__Adapter(getActivity(),addTrackingNumList);
        rvAddTrackginNumber.setAdapter(add_tracking_number__adapter);
        LinearLayoutManager llm_recent =new LinearLayoutManager(getActivity());
        rvAddTrackginNumber.setLayoutManager(llm_recent);

        addTrackingNumList.add("790-456-9683");
        addTrackingNumList.add("790-456-9683");
        addTrackingNumList.add("790-456-96833");
        addTrackingNumList.add("790-456-9683");
        addTrackingNumList.add("790-456-9683");

        add_tracking_number__adapter.notifyDataSetChanged();
        rvAddTrackginNumber.refreshDrawableState();
        rvAddTrackginNumber.invalidate();

    }

}
