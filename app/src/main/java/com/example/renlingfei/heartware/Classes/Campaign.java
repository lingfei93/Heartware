package com.example.renlingfei.heartware.Classes;

import android.widget.DatePicker;

/**
 * Created by renlingfei on 23/9/17.
 */

public class Campaign {
    String campaignName;
    String description;
    Person campaignIC;
    String[] categories;
    String[] location;
    Person[] collectors; //haven't set this yet

    public void setCampaign_name(String campaignName){
        this.campaignName = campaignName;
    }

    public String getCampaign_name(){
        return this.campaignName;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

    public void setCampaignIC(Person campaignIC){
        this.campaignIC = campaignIC;
    }

    public Person getCampaignIC(){
        return this.campaignIC;
    }

    public void setCategories(String[] categories){
        this.categories = new String[categories.length];
        for (int i = 0; i < this.categories.length; i ++){
            this.categories[i] = categories[i];
        }
    }

    public String getCategoryAtPosition(int position){
        return this.categories[position];
    }

    public void setLocation(String[] location){
        this.location = new String[location.length];
        for (int i = 0; i < this.location.length; i ++){
            this.location[i] = location[i];
        }
    }

    public String getCategoryAtLocation(int position){
        return this.location[position];
    }

}
