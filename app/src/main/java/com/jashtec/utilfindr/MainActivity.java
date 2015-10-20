package com.jashtec.utilfindr;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import java.util.List;
import java.util.Vector;

import Common.Adapter.PagerAdapter;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    private TabLayout.OnTabSelectedListener tabSelectedListener = new TabLayout.OnTabSelectedListener() {
        @Override
        public void onTabSelected(TabLayout.Tab tab) {
            Log.d("PagerAdapter", String.valueOf(tab.getPosition()));
            viewPager.setCurrentItem(tab.getPosition());
        }

        @Override
        public void onTabUnselected(TabLayout.Tab tab) {

        }

        @Override
        public void onTabReselected(TabLayout.Tab tab) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab_health));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab_food));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab_electronics));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab_utilities));
        tabLayout.setOnTabSelectedListener(tabSelectedListener);

        viewPager = (ViewPager) findViewById(R.id.pager);

        //Add Fragments
        List<Fragment> fragments = new Vector<Fragment>();
        Bundle page = new Bundle();
        fragments.add(Fragment.instantiate(this, healthFragment.class.getName(), page));
        fragments.add(Fragment.instantiate(this, foodFragment.class.getName(), page));
        fragments.add(Fragment.instantiate(this, electronicsFragment.class.getName(), page));
        fragments.add(Fragment.instantiate(this, utilitiesFragment.class.getName(), page));

        //PagerAdapter invocation
        final PagerAdapter adapter = new PagerAdapter
                (getFragmentManager(), fragments);
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab_health));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab_food));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab_electronics));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab_utilities));
        tabLayout.setOnTabSelectedListener(tabSelectedListener);

        viewPager = (ViewPager) findViewById(R.id.pager);

        //Add Fragments
        List<Fragment> fragments = new Vector<Fragment>();
        Bundle page = new Bundle();
        fragments.add(Fragment.instantiate(this, healthFragment.class.getName(), page));
        fragments.add(Fragment.instantiate(this, foodFragment.class.getName(), page));
        fragments.add(Fragment.instantiate(this, electronicsFragment.class.getName(), page));
        fragments.add(Fragment.instantiate(this, utilitiesFragment.class.getName(), page));

        //PagerAdapter invocation
        final PagerAdapter adapter = new PagerAdapter
                (getFragmentManager(), fragments);
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }
}