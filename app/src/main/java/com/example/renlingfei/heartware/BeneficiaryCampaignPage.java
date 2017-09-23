package com.example.renlingfei.heartware;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;

public class BeneficiaryCampaignPage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beneficiary_campaign_page);

        int num_donors = 20;
        int num_collectors = 10;

        TableLayout collector_table = (TableLayout) findViewById(R.id.table_beneficiary_profile_collectors);
        TableLayout donor_table = (TableLayout) findViewById(R.id.table_beneficiary_profile_donors);

        TableRow collector_table_row = new TableRow(this);
        TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
        collector_table_row.setLayoutParams(lp);

        for (int i = 0; i < num_donors; i++) {

        }

    }
}
