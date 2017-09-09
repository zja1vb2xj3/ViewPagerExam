package com.example.user.test;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private Fragment pageFragment;
    private PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Fragment> fragments = getFragment();
        pagerAdapter = new PagerAdapter(getSupportFragmentManager(), fragments);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        viewPager.setAdapter(pagerAdapter);
    }

    private ArrayList<Fragment> getFragment(){
        ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();
        fragmentList.add(PageFragment.newInstance("Fragment 1"));
        fragmentList.add(PageFragment.newInstance("Fragment 2"));
        fragmentList.add(PageFragment.newInstance("Fragment 3"));

        return fragmentList;
    }

    private class PagerAdapter extends FragmentPagerAdapter{

        private ArrayList<Fragment> fragments;

        public PagerAdapter(FragmentManager fm, ArrayList<Fragment> fragments) {
            super(fm);
            this.fragments = fragments;
        }

        @Override
        public Fragment getItem(int position) {
            return this.fragments.get(position);
        }

        @Override
        public int getCount() {
            return this.fragments.size();
        }
    }
}
