package com.example.viewpager_class_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayoutCompon;
    ViewPager2 viewPagerCompon;
    ViewPagerAdapter objAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializar();
        viewPagerCompon.setAdapter(objAdapter);

        tabLayoutCompon.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPagerCompon.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPagerCompon.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabLayoutCompon.getTabAt(position).select();
            }
        });
    }

    private void inicializar() {
        tabLayoutCompon = findViewById(R.id.tabLayoutCompon);
        viewPagerCompon = findViewById(R.id.viewPagerCompon);
        objAdapter = new ViewPagerAdapter(this);
    }
}