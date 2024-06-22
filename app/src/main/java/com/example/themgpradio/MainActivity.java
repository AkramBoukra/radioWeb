package com.example.themgpradio;


import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.themgpradio.navigation.LiveStreamFragment;
import com.example.themgpradio.navigation.NewsFragment;
import com.example.themgpradio.navigation.PodcastFragment;
import com.example.themgpradio.navigation.WebRadioFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    BottomNavigationView nMain_nav;
    FrameLayout nMain_frame;
    private Fragment Fragment;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nMain_nav = findViewById(R.id.main_nav);
        nMain_frame = findViewById(R.id.main_frame);

         Fragment = getSupportFragmentManager().findFragmentById(R.id.main_frame);
        if (Fragment==null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new WebRadioFragment()).commit();
        }




        nMain_nav.setOnNavigationItemSelectedListener(item -> {
            Fragment selectedFragment = null;


            switch (item.getItemId()) {

                case R.id.nav_webRadio:
                    selectedFragment = new WebRadioFragment();
                    break;

                case R.id.nav_liveStream:
                    selectedFragment = new LiveStreamFragment();
                    break;

                case R.id.nav_news:
                    selectedFragment = new NewsFragment();
                    break;

                case R.id.nav_podcast:
                    selectedFragment = new PodcastFragment();
                    break;
            }
           getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, selectedFragment).commit();
            return true;
        });
    }


}