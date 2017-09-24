package com.example.renlingfei.heartware;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.net.Uri;
import android.widget.Toast;

import com.example.renlingfei.heartware.Classes.Campaign;
import com.example.renlingfei.heartware.Classes.Database;

public class BeneficiaryProfilePage extends AppCompatActivity {
    Button createCamButton;
    Button learnMoreButton;
    BeneficiaryProfilePage currentScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beneficiary_profile_page);

        currentScreen = this;
        createCamButton = (Button) findViewById(R.id.addCamButton);
        createCamButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(currentScreen, StartCampaign.class);
                startActivity(myIntent);
            }
        });

        learnMoreButton = (Button)findViewById(R.id.learnButton);
        learnMoreButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.aspn.org"));
                startActivity(intent);
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
                        startActivity(new Intent(BeneficiaryProfilePage.this,SearchPage.class));
                        break;

                }
                return true;

            }
        });
    }
}
