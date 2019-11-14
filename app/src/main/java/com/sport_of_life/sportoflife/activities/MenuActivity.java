package com.sport_of_life.sportoflife.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.sport_of_life.sportoflife.R;
import com.sport_of_life.sportoflife.activities.menuItems.EasyLevel;
import com.sport_of_life.sportoflife.activities.menuItems.HardLevel;
import com.sport_of_life.sportoflife.activities.menuItems.MediumLevel;
import com.sport_of_life.sportoflife.activities.menuItems.VKE;
import com.sport_of_life.sportoflife.activities.progress.Progress;

public class MenuActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Fragment fragment = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        displaySelectedScreen(item.getItemId());
        return true;
    }

    private  void displaySelectedScreen(int itemId) {

        Fragment fragment = null;

        switch (itemId){
            case R.id.vkeItem:
                fragment = new VKE();
                break;
            case R.id.subitem1:
                fragment = new EasyLevel();
                break;
            case R.id.subitem2:
                fragment = new MediumLevel();
                break;
            case R.id.subitem3:
                fragment = new HardLevel();
                break;
            case R.id.timer:
                fragment = new Timer();
                break;
            case R.id.subitem4:
                fragment = new Progress();
                break;
            case R.id.item4:
                fragment = new Hakkimizda();
                break;
        }

        if(fragment != null){
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.contentMenuLayout, fragment);
            ft.commit();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }
}
