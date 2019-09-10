package com.andorid.bottom_nav_bar;

import android.content.Intent;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import static com.andorid.bottom_nav_bar.R.string.open;

public class splash_screen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        /*setContentView(R.layout.dashboard);
        setContentView(R.layout.home);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawerLayout = findViewById(R.id.drawer_Layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar, open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        NavigationView navigationView = findViewById(R.id.navView);
        drawerLayout.addDrawerListener(toggle);
        if(getSupportActionBar() != null) getSupportActionBar().setHomeButtonEnabled(true);
        toggle.syncState();

    if(navigationView != null){
        navigationView.setNavigationItemSelectedListener(this);
    }*/

        int splash_time_out = 2000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashintent = new Intent(splash_screen.this, signUp.class);
                startActivity(splashintent);
                finish();
            }
        }, splash_time_out);

    }
}
