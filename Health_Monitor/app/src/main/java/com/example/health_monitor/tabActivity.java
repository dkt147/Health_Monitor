package com.example.health_monitor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class tabActivity extends AppCompatActivity {

    TabLayout tabLayout;
    Toolbar toolbar;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewpager);

        ViewPageAdapter viewPageAdapter = new ViewPageAdapter(getSupportFragmentManager());

        viewPageAdapter.addFragment(new Fragment1(),"");
        viewPageAdapter.addFragment(new Fragment2(),"");
        viewPageAdapter.addFragment(new Fragment3(),"");
        viewPageAdapter.addFragment(new Fragment4(),"");
        viewPageAdapter.addFragment(new Fragment5(),"");

        viewPager.setAdapter(viewPageAdapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.home);
        tabLayout.getTabAt(1).setIcon(R.drawable.trend);
        tabLayout.getTabAt(2).setIcon(R.drawable.calculator);
        tabLayout.getTabAt(3).setIcon(R.drawable.analysis);
        tabLayout.getTabAt(4).setIcon(R.drawable.profile);

    }
}