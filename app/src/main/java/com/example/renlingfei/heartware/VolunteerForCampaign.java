package com.example.renlingfei.heartware;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class VolunteerForCampaign extends AppCompatActivity {
    Button backButton;
    Button donateToButton;
    Button collectForButton;
    VolunteerForCampaign currentScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteer_for_campaign);
        currentScreen = this;
        backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(currentScreen, MainActivity.class);
                startActivity(myIntent);
            }
        });

        donateToButton = (Button) findViewById(R.id.donateToButton);
        donateToButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(currentScreen, DonateToCampaign.class);
                startActivity(myIntent);
            }
        });

        collectForButton = (Button) findViewById(R.id.collectForCamButton);
        collectForButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(currentScreen, CollectForCampaign.class);
                startActivity(myIntent);
            }
        });

    }

}
