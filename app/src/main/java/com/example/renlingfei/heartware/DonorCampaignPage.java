package com.example.renlingfei.heartware;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TableLayout;

public class DonorCampaignPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor_campaign_page);
        TableLayout progress_bar_table = new TableLayout(this);
        ImageView progress_bar = new ImageView(this);

        progress_bar.findViewById(R.id.image_donor_profile_progress);
        progress_bar.setImageDrawable(getResources().getDrawable(R.drawable.progressbar));
    }
}
