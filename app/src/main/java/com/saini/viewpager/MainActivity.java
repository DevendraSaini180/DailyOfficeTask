package com.saini.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TabLayout mTabLayout;
    ViewPager mViewPager;
    CustomAdapter mCustomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uiInitialization();
        setTabLayout();
        setTabLayout();
        setViewPager();
    }

    public void uiInitialization() {
        mViewPager = findViewById(R.id.viewPager);
        mTabLayout = findViewById(R.id.tab_layout);
    }

    public void setTabLayout() {
        TabLayout.Tab firstTab = mTabLayout.newTab();
        firstTab.setText("First");
        mTabLayout.addTab(firstTab);
        TabLayout.Tab secondTab = mTabLayout.newTab();
        secondTab.setText("Second");
        mTabLayout.addTab(secondTab);
        TabLayout.Tab thirdTab = mTabLayout.newTab();
        thirdTab.setText("Third");
        mTabLayout.addTab(thirdTab);
    }

    public void setViewPager() {
        mCustomAdapter = new CustomAdapter(getSupportFragmentManager(), mTabLayout.getTabCount());
        mViewPager.setAdapter(mCustomAdapter);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
    }
}