package com.example.renlingfei.heartware;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class DonateToCampaign extends AppCompatActivity {
    Button backButton;
    Button submitButton;
    DonateToCampaign currentScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate_to_campaign);

        backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(currentScreen,VolunteerForCampaign.class);
                startActivity(myIntent);
            }
        });

        submitButton = (Button) findViewById(R.id.donateCamButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(currentScreen, ProfilePage.class);
                startActivity(myIntent);
            }
        });
    }

}
