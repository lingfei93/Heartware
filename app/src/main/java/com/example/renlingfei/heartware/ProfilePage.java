package com.example.renlingfei.heartware;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ProfilePage extends AppCompatActivity {
    Button donateToButton;
    Button collectForButton;
    ProfilePage currentScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        donateToButton = (Button) findViewById(R.id.currCamPic1);
        donateToButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(currentScreen, DonorCampaignPage.class);
                startActivity(myIntent);
            }
        });

        collectForButton = (Button) findViewById(R.id.oldCamPic1);
        collectForButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(currentScreen, CollectorCampaignPage.class);
                startActivity(myIntent);
            }
        });
    }

}
