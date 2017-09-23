package com.example.renlingfei.heartware.Classes;

import android.widget.DatePicker;

/**
 * Created by renlingfei on 23/9/17.
 */

public class TimeSlot {
    DatePicker date;
    String time;



    public void pickTime(boolean test){
        if(test){
            this.time = "12-5pm";
        }
        else {
            this.time = "8-12pm";
        }
    }

}
