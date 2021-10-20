package com.saini.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uiInitialization();
        mViewPager.setAdapter(new ViewPagerAdapter(this));
    }

    public void uiInitialization() {
        mViewPager = findViewById(R.id.viewPager);
    }
}