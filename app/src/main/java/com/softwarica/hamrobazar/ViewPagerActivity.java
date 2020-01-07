package com.softwarica.hamrobazar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.softwarica.hamrobazar.adapter.ViewPagerAdapter;
import com.softwarica.hamrobazar.fragments.LoginFragment;

public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        viewPager = findViewById(R.id.viewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new LoginFragment());

        viewPager.setAdapter(viewPagerAdapter);

    }
}
