package com.capturemultipleimage;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.capturemultipleimage.Adapter.TabsPagerAdapter;

/**
 * Created by Suthishan on 20/1/2018.
 */

public class ImageSelectedActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabsPagerAdapter mAdapter;
    private ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_selected);
        intUI();
        onClickListner();
    }

    private void onClickListner() {


    }

    private void intUI() {

    }
}
