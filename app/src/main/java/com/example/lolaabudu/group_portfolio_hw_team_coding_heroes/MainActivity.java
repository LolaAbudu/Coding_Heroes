package com.example.lolaabudu.group_portfolio_hw_team_coding_heroes;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerLayout = findViewById(R.id.drawer_layout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        switch (menuItem.getItemId()){

                            case R.id.nav_fribel:
                                menuItem.setChecked(true);
                                mDrawerLayout.closeDrawers();
                                Intent fribel = new Intent(MainActivity.this, Fribelsprofile.class);
                                startActivity(fribel);
                                return true;
                            case R.id.nav_lola:
                                menuItem.setChecked(true);
                                mDrawerLayout.closeDrawers();
                                Intent lola = new Intent(MainActivity.this, LolaProfileActivity.class);
                                startActivity(lola);
                                return true;
                            case R.id.nav_sheriff:
                                menuItem.setChecked(true);
                                mDrawerLayout.closeDrawers();
                                Intent sheriff = new Intent(MainActivity.this, SheriffProfileActivity.class);
                                startActivity(sheriff);
                                return true;
                            case R.id.nav_naomy:
                                menuItem.setChecked(true);
                                mDrawerLayout.closeDrawers();
                                startNaomyActivity();
                                return true;
                        }
                        return false;
                    }
                });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void startNaomyActivity(){
        Intent naomyActivity = new Intent(MainActivity.this, NaomyProfileActivity.class);
        startActivity(naomyActivity);
    }
}



