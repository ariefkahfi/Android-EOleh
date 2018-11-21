package com.example.arief.ecommerceoleholeh;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.arief.ecommerceoleholeh.adapter.MyViewPagerAdapter;

public class HomeActivity extends AppCompatActivity {


    private Toolbar toolbar;
    private DrawerLayout mDrawer;
    private NavigationView mNavigationView;
    private ViewPager viewPager;
    private MyViewPagerAdapter pagerAdapter;







    private ViewPager.SimpleOnPageChangeListener onPageChangeListener
            =new ViewPager.SimpleOnPageChangeListener(){

        @Override
        public void onPageSelected(int position) {
            switch (position) {
                case 0:
                    getSupportActionBar().setTitle("List Product");
                    break;
                case 1:
                    getSupportActionBar().setTitle("Sell Product");
                    break;
            }
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);
        toolbar = findViewById(R.id.toolbar);
        mDrawer= findViewById(R.id.drawer_layout);
        mNavigationView = findViewById(R.id.nav_view);
        viewPager = findViewById(R.id.view_pager);
        pagerAdapter = new MyViewPagerAdapter(getSupportFragmentManager());




        mNavigationView.setCheckedItem(R.id.list_product);
        mNavigationView.setNavigationItemSelectedListener(onNavItemSelectedListener);

        setSupportActionBar(toolbar);


        viewPager.addOnPageChangeListener(onPageChangeListener);
        viewPager.setAdapter(pagerAdapter);



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);
    }

    private NavigationView.OnNavigationItemSelectedListener onNavItemSelectedListener = new NavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.sell_product:
                    viewPager.setCurrentItem(1 , true);
                    break;
                case R.id.list_product:
                    viewPager.setCurrentItem( 0 , true);
                    break;
            }


            mDrawer.closeDrawer(GravityCompat.START);
            return true;
        }
    };


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawer.openDrawer(GravityCompat.START);
                return true;
                default:
                    return super.onOptionsItemSelected(item);
        }
    }
}
