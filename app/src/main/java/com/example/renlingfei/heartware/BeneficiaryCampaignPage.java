package com.example.renlingfei.heartware;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

public class BeneficiaryCampaignPage extends Activity {
    TextView donor_label;
    TextView collector_label;
    int num_donors;
    int num_collectors;


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        donor_label= new TextView(this);
        collector_label = new TextView(this);
        num_donors = 20;
        num_collectors = 10;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beneficiary_campaign_page);

        donor_label.findViewById(R.id.text_beneficiary_profile_donors);
        donor_label.findViewById(R.id.text_beneficiary_profile_collectors);
        donor_label.setText(num_donors + " donors");
        collector_label.setText(num_collectors + " collectors");
        populateCollectorTable();
        populateDonorTable();
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void populateDonorTable(){
        TableLayout donor_table = (TableLayout) findViewById(R.id.table_beneficiary_profile_donors);

        TableRow donor_table_row = new TableRow(this);
        TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
        donor_table_row.setLayoutParams(lp);

        for (int i = 0; i < num_donors; i++) {
            //create table for each donor
            TableLayout each_donor = new TableLayout(this);

            //create name
            TextView donor_name = new TextView(this);
            donor_name.setText("Name " + i);
            donor_name.setTypeface(null, donor_name.getTypeface().BOLD);
            donor_name.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            //create image
            final ImageButton profile_picture = new ImageButton(this);
            profile_picture.setImageDrawable(getResources().getDrawable(R.drawable.halfway));
            profile_picture.setBackgroundColor(0);

            //create toggleButton
            final ToggleButton collected = new ToggleButton(this);
            collected.setText("Collected");
            collected.setTextOff("Collected");
            collected.setTextOn("Collected");
            collected.setTextSize(12);
            collected.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked){
                        profile_picture.setImageDrawable(getResources().getDrawable(R.drawable.done));
                    }
                    else {
                        profile_picture.setImageDrawable(getResources().getDrawable(R.drawable.halfway));
                    }
                }
            });

            //add image, name, toggle to each_donor table
            each_donor.addView(profile_picture);
            each_donor.addView(donor_name);
            each_donor.addView(collected);

            //add view
            donor_table_row.addView(each_donor);
        }

        //add row to table
        donor_table.addView(donor_table_row);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void populateCollectorTable(){
        TableLayout collector_table = (TableLayout) findViewById(R.id.table_beneficiary_profile_collectors);

        TableRow collector_table_row = new TableRow(this);
        TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
        collector_table_row.setLayoutParams(lp);

        for (int i = 0; i < num_collectors; i++) {
            //create table for each donor
            TableLayout each_donor = new TableLayout(this);

            //create name
            TextView collector_name = new TextView(this);
            collector_name.setText("Name " + i);
            collector_name.setTypeface(null, collector_name.getTypeface().BOLD);
            collector_name.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            //create Button
            Button contact = new Button(this);
            contact.setText("contact");
            contact.setTextSize(12);

            //create image
            ImageButton profile_picture = new ImageButton(this);
            profile_picture.setImageDrawable(getResources().getDrawable(R.drawable.profilepic));
            profile_picture.setBackgroundColor(0);

            //add image, name, toggle to each_donor table
            each_donor.addView(profile_picture);
            each_donor.addView(collector_name);
            each_donor.addView(contact);

            //add view
            collector_table_row.addView(each_donor);
        }

        //add row to table
        collector_table.addView(collector_table_row);
    }
}
