package com.pcube.callify;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import com.pcube.callify.Fragment.Fragment_Aboutus;
import com.pcube.callify.NavgationDrawerUtils.FragmentDrawer;


public class MainActivity extends AppCompatActivity implements FragmentDrawer.FragmentDrawerListener{
    boolean doubleBackToExitPressedOnce = false;
    private static String TAG = MainActivity.class.getSimpleName();
    public static DrawerLayout drawer;
    private FragmentDrawer drawerFragment;
    private Toolbar mToolbar;
    public static Fragment fragment;
    Context context;
    String message;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);




        drawerFragment = (FragmentDrawer) getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer,drawer, mToolbar);
        drawerFragment.setDrawerListener(this);

            fragment=new Fragment_Aboutus();
            FragmentTransaction fragmentTransaction =  getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.container_body, fragment).commit();


    }




    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            if (doubleBackToExitPressedOnce) {
                super.onBackPressed();
                return;
            }

            this.doubleBackToExitPressedOnce = true;
            Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {
                    doubleBackToExitPressedOnce=false;
                }
            }, 2000);
        }
    }

    public void onDrawerItemSelected(View view, int position) {
        displayView(position);
    }

    private void displayView(int position) {
        fragment = null;
        String title = getString(R.string.app_name);
        switch (position) {
            case 0:
                fragment = new Fragment_Aboutus();
                break;
            default:
                break;
        }

        if (fragment != null) {
            FragmentTransaction fragmentTransaction =  getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.container_body, fragment).commit();

        }
    }
}
