package com.openclassrooms.myamazingviewpager.Controllers.Activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.openclassrooms.myamazingviewpager.Adapters.PageAdapter;
import com.openclassrooms.myamazingviewpager.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Configure ViewPager
        this.configureViewPager();
    }

    private void configureViewPager(){
        //Get ViewPager from layout
        ViewPager pager = (ViewPager)findViewById(R.id.activity_main_viewpager);
        //Set Adapter PageAdapter and glue it together
        pager.setAdapter(new PageAdapter(getSupportFragmentManager()));

        TabLayout tabs = (TabLayout)findViewById(R.id.activity_main_tabs);

        tabs.setupWithViewPager(pager);

        tabs.setTabMode(TabLayout.MODE_FIXED);

    }

}
