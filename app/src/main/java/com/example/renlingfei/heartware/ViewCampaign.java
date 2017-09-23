package com.example.renlingfei.heartware;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ViewCampaign extends AppCompatActivity {
    Button backButton;
    Button updateCamButton;
    ViewCampaign currentScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_campaign);

        currentScreen = this;
        updateCamButton = (Button) findViewById(R.id.createCamButton);
        updateCamButton.setOnClickListener(new View.OnClickListener() {
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
                Intent myIntent = new Intent(currentScreen, BeneficiaryCampaignPage.class);
                startActivity(myIntent);
            }
        });
    }

}
