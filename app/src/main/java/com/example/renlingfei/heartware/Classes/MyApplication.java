package com.example.renlingfei.heartware.Classes;

import android.app.Application;

/**
 * Created by renlingfei on 24/9/17.
 */

public class MyApplication extends Application {
    private Campaign test;
    private MyApplication(){
    }

    public Campaign getCampaign(){
        return test;
    }

    public void setCampaign(Campaign campaign){
        this.test = campaign;
    }


    private static final MyApplication ourInstance = new MyApplication();

    static MyApplication getInstance() {
        return ourInstance;
    }


}
