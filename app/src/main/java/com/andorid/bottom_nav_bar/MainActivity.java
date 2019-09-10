package com.andorid.bottom_nav_bar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.support.v7.widget.Toolbar;
import android.widget.Button;

import static com.andorid.bottom_nav_bar.R.string.open;

public class MainActivity extends AppCompatActivity  implements BottomNavigationView.OnNavigationItemSelectedListener  {

   Button profileButton;
    BottomNavigationView bottomNavigationView;
    ActionBarDrawerToggle toggle;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, Profile.class);
                startActivity(intent1);
                finish();
            }
        });
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    Home homefragment = new Home();
    CreateUpdate updatefragment = new CreateUpdate();
    Menu menufragment = new Menu();
    Upload uploadfragment = new Upload();
    messageFragment messageFragment = new messageFragment();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId())
        {
            case R.id.home:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,homefragment).commit();
                return true;

            case R.id.message:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,messageFragment).commit();
                return true;

            case R.id.update:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,updatefragment).commit();
                return true;

            case R.id.menu:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,menufragment).commit();
                return true;

            case R.id.concern:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,uploadfragment).commit();
                return true;
        }
        return false;
    }

    public void feedback(View view) {
        Intent intent = new Intent(MainActivity.this, Feedback.class);
        startActivity(intent);
    }

    public void query(View view) {
        Intent intent1 = new Intent(MainActivity.this, query.class);
        startActivity(intent1);
    }

    public void report(View view) {
        Intent intent1 = new Intent(MainActivity.this, report.class);
        startActivity(intent1);
    }

    public void data(View view) {
        Intent intent1 = new Intent(MainActivity.this, studentdata.class);
        startActivity(intent1);
    }

}
