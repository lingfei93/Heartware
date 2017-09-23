package com.example.renlingfei.heartware;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.net.Uri;

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
    }
}
