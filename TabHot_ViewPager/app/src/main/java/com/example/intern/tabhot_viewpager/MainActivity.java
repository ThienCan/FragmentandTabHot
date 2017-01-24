package com.example.intern.tabhot_viewpager;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TabHost;

import com.example.intern.tabhot_viewpager.Adapter.MyFragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViewPager();

//        initTabHost();
    }

//    private void initTabHost() {
//
//        tabHost = (TabHost) findViewById(R.id.tabhost);
//        tabHost.setup();
//
//        String[] tabNamesArray = {"Tab1","Tab2","Tab3","Tab4","Tab5","Tab6"};
//
//        for(int i=0;i<tabNamesArray.length;i++){
//            TabHost.TabSpec tabSpec;
//            tabSpec = tabHost.newTabSpec(tabNamesArray[i]);
//            tabSpec.setIndicator(tabNamesArray[i]);
//            tabSpec.setContent(new FakeContent(getApplicationContext()));
//            tabHost.addTab(tabSpec);
//        }
//    }
//   class FakeContent implements TabHost.TabContentFactory {
//        Context context;
//
//        public FakeContent(Context context) {
//            this.context = context;
//        }
//
//        @Override
//        public View createTabContent(String tag) {
//            View fakeView = new View(context);
//            fakeView.setMinimumHeight(0);
//            fakeView.setMinimumWidth(0);
//
//            return fakeView;
//        }
//    }

    private void initViewPager() {
        viewPager = (ViewPager) findViewById(R.id.view_pager);

        List<Fragment> listFragment = new ArrayList<Fragment>();
        listFragment.add(new Fragment1());
        listFragment.add(new Fragment2());
        listFragment.add(new Fragment3());

        MyFragmentPagerAdapter myFragmentPagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager(),listFragment);
        viewPager.setAdapter(myFragmentPagerAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate();
        return super.onCreateOptionsMenu(menu);
    }
}
