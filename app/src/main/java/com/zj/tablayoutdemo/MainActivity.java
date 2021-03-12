package com.zj.tablayoutdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import com.flyco.tablayout.SlidingTabLayout;

public class MainActivity extends AppCompatActivity {
    SlidingTabLayout tabLayout;
    String[] nameList = new String[]{"课堂报告","学习记录"};
    CannotScrollViewPager viewPager;
    private Fragment[] fragments;
    private ReportFragmentAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.vp);

        fragments = new Fragment[2];
        fragments[0] = new RedFragment();
        fragments[1] = new BlueFragment();

        adapter = new ReportFragmentAdapter(getSupportFragmentManager(), fragments, nameList);
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(2);

        tabLayout.setViewPager(viewPager, nameList);

    }
}