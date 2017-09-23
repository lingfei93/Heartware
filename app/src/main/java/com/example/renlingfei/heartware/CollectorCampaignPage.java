package com.example.renlingfei.heartware;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.ToggleButton;

public class CollectorCampaignPage extends Activity {

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int allocation_size = 4;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collector_campaign_page);

        //for each row
        for (int i = 0; i < allocation_size; i++) {
            //variables
            TextView name = new TextView(this);
            TextView address = new TextView(this);
            ToggleButton toggle_button = new ToggleButton(this);

            //find table
            TableLayout ll = (TableLayout) findViewById(R.id.table_collector_profile_allocation);

            //create row
            TableRow row = new TableRow(this);
            TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
            row.setLayoutParams(lp);
            row.setPaddingRelative(0, 10, 0, 10);

            //create image
            ImageButton profile_picture = new ImageButton(this);
            profile_picture.setImageDrawable(getResources().getDrawable(R.drawable.profilepic));
            profile_picture.setBackgroundColor(0);

            //create second column
            TableLayout details_table = new TableLayout(this);
            details_table.setPaddingRelative(20, 0, 10, 0);

            //fill name
            name.setText("Name " + i);
            name.setTypeface(null, name.getTypeface().BOLD);
            address.setText("Nanyang Technological University, 50 Nanyang Ave, 639798");
            details_table.addView(name);
            details_table.addView(address);

            //create toggle
            toggle_button.setText("Collected");
            toggle_button.setTextOff("Collected");
            toggle_button.setTextOn("Collected");

            //add items to row
            row.addView(profile_picture);
            row.addView(details_table);
            row.addView(toggle_button);

            //add row to table
            ll.addView(row, i);
        }

    }

}
