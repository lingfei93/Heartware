package com.example.renlingfei.heartware.Classes;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by renlingfei on 24/9/17.
 */

public class Database implements Parcelable {
    private Campaign campaign;
    private Person person;

    public Database(){

    }

    public Campaign getCampaign(){
        return this.campaign;
    }

    public Person getPerson(){
        return this.person;
    }

    public void setCampaign(Campaign campaign){
        this.campaign = campaign;
    }

    public void setPerson(Person person){
        this.person = person;
    }

    protected Database(Parcel in) {
        campaign = (Campaign) in.readValue(Campaign.class.getClassLoader());
        person = (Person) in.readValue(Person.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(campaign);
        dest.writeValue(person);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Database> CREATOR = new Parcelable.Creator<Database>() {
        @Override
        public Database createFromParcel(Parcel in) {
            return new Database(in);
        }

        @Override
        public Database[] newArray(int size) {
            return new Database[size];
        }
    };
}
