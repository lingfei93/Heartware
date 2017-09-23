package com.example.renlingfei.heartware;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class StartCampaign extends AppCompatActivity {
    Button createCamButton;
    Button backButton;
    StartCampaign currentScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_campaign);

        currentScreen = this;
        createCamButton = (Button) findViewById(R.id.createCamButton);
        createCamButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(currentScreen, BeneficiaryCampaignPage.class);
                startActivity(myIntent);
            }
        });

        backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(currentScreen, BeneficiaryProfilePage.class);
                startActivity(myIntent);
            }
        });

    }
}
