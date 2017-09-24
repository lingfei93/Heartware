package com.example.renlingfei.heartware;

import android.Manifest;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.renlingfei.heartware.Classes.Campaign;
import com.example.renlingfei.heartware.Classes.Database;
import com.example.renlingfei.heartware.Classes.MyApplication;


public class MainActivity extends AppCompatActivity {
    MainActivity currentScreen;
    TextView myTextView;
    Button btn;
    Button donorCam;
    Button collectorCam;
    Button regionEvent1;
    Button regionEvent2;
    Button regionEvent3;
    Button regionEvent4;

    Button test;

    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        currentScreen = this;

        donorCam = (Button) findViewById(R.id.signedup1);
        donorCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(currentScreen, DonorCampaignPage.class);
                startActivity(myIntent);
            }
        });

        collectorCam = (Button) findViewById(R.id.signedup2);
        collectorCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(currentScreen, CollectorCampaignPage.class);
                startActivity(myIntent);
            }
        });

        regionEvent1 = (Button) findViewById(R.id.regionEvent1);
        regionEvent2 = (Button) findViewById(R.id.regionEvent2);
        regionEvent3 = (Button) findViewById(R.id.regionEvent3);
        regionEvent4 = (Button) findViewById(R.id.regionEvent4);
        regionEvent1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(currentScreen, VolunteerForCampaign.class);
                startActivity(myIntent);
            }
        });
        regionEvent2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(currentScreen, VolunteerForCampaign.class);
                startActivity(myIntent);
            }
        });
        regionEvent3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(currentScreen, VolunteerForCampaign.class);
                startActivity(myIntent);
            }
        });
        regionEvent4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(currentScreen, VolunteerForCampaign.class);
                startActivity(myIntent);
            }
        });

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_profile:
                        Toast.makeText(getApplicationContext(), "Your toast message.",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_homepage:
                        Intent intent = new Intent(getBaseContext(), MainActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.action_campaign:
                        startActivity(new Intent(MainActivity.this,SearchPage.class));
                        break;

                }
                return true;

            }
        });
    }
}
