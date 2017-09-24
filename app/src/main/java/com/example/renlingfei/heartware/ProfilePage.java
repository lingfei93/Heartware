package com.example.renlingfei.heartware;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ProfilePage extends AppCompatActivity {
    Button donateToButton;
    Button collectForButton;
    ProfilePage currentScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);
        currentScreen = this;
        donateToButton = (Button) findViewById(R.id.profDon1);
        donateToButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(currentScreen, DonorCampaignPage.class);
                startActivity(myIntent);
            }
        });

        collectForButton = (Button) findViewById(R.id.profCol1);
        collectForButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(currentScreen, CollectorCampaignPage.class);
                startActivity(myIntent);
            }
        });

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_profile:
                        Toast.makeText(getApplicationContext(), "Your Profile.",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_homepage:
                        Intent intent = new Intent(getBaseContext(), MainActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.action_campaign:
                        startActivity(new Intent(ProfilePage.this,SearchPage.class));
                        break;

                }
                return true;

            }
        });
    }

}
