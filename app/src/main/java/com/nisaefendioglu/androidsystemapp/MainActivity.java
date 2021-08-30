package com.nisaefendioglu.androidsystemapp;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationappView,bottomNavigationView;
    Fragment fragment = null;
    int counter = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomNavigationappView = findViewById(R.id.bottomNavigationapp);
        bottomNavigationappView.setItemIconTintList(null);
        bottomNavigationappView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.phone:
                        bottomNavigationappView.findViewById(R.id.bottomNavigationapp).setVisibility(View.GONE);
                        bottomNavigationView.findViewById(R.id.bottomNavigation).setVisibility(View.VISIBLE);
                        fragment = new Call();
                        break;
                    case R.id.internet:
                        bottomNavigationappView.findViewById(R.id.bottomNavigationapp).setVisibility(View.GONE);
                        bottomNavigationView.findViewById(R.id.bottomNavigation).setVisibility(View.VISIBLE);
                        fragment = new Internet();
                        break;
                    case R.id.messages:
                        bottomNavigationappView.findViewById(R.id.bottomNavigationapp).setVisibility(View.GONE);
                        bottomNavigationView.findViewById(R.id.bottomNavigation).setVisibility(View.VISIBLE);
                        fragment = new Chat();
                        break;
                    case R.id.apps:
                        counter ++;
                        if (counter % 2 == 0) {
                            fragment = new Apps();
                            break;
                        }
                        else {
                            Intent appClose = new Intent(MainActivity.this,MainActivity.class);
                            startActivity(appClose);
                        }
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,fragment).commit();
                return true;
            }
        });
        bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setItemIconTintList(null);
        bottomNavigationView.findViewById(R.id.bottomNavigation).setVisibility(View.GONE);

        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.back:
                        Intent back = new Intent(MainActivity.this,MainActivity.class);
                        startActivity(back);
                        break;
                    case R.id.exit:
                        Intent exit = new Intent(MainActivity.this,MainActivity.class);
                        startActivity(exit);
                        break;
                    case R.id.all:
                        Intent all = new Intent(MainActivity.this,MainActivity.class);
                        startActivity(all);
                        break;
                }
            }
        });

    }
}