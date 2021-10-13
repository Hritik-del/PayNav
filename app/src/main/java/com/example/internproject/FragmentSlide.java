package com.example.internproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class FragmentSlide extends AppCompatActivity{

    TabLayout tb;
    ViewPager vp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_slide);

        tb = findViewById(R.id.tab_layout);
        tb.addTab(tb.newTab().setText("return"));
        tb.addTab(tb.newTab().setText("receive"));
        vp = findViewById(R.id.pager);
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), tb.getTabCount());
        vp.setAdapter(adapter);
        tb.setupWithViewPager(vp);
    }
}