package com.example.renlingfei.heartware;

import android.Manifest;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.renlingfei.heartware.Classes.Campaign;
import com.example.renlingfei.heartware.Classes.Database;
import com.example.renlingfei.heartware.Classes.MyApplication;


public class MainActivity extends AppCompatActivity {
    MainActivity currentScreen;
    TextView myTextView;
    Button btn;

    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

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
                        Database db = new Database();
                        Campaign test = new Campaign();
                        test.setCampaign_name("helooOo");
                        db.setCampaign(test);
                        intent.putExtra("testParcel", db);
                        startActivity(intent);
                        break;
                    case R.id.action_campaign:
                        startActivity(new Intent(MainActivity.this,SearchPage.class));
                        break;

                }
                return true;

            }
        });
    }
}
