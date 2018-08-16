package com.example.windows.meshkah2;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Main2Activity extends AppCompatActivity {
    private ViewPager mPager;
    private int[] layouts={R.drawable.fi,R.drawable.bg2,R.drawable.four};
    private Khf1 khf1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mPager=(ViewPager)findViewById(R.id.viewPager);
        khf1=new Khf1(layouts,this);
        mPager.setAdapter(khf1);

    }


}
