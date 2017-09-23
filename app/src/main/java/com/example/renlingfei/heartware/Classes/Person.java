package com.example.renlingfei.heartware.Classes;

/**
 * Created by renlingfei on 23/9/17.
 */

public class Person {
    String name;
    String address;
    Double contactNumber;
    //Beneficiary[] beneficiaryEndorsement;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return this.address;
    }

    public void setContactNumber(double contactNumber){
        this.contactNumber = contactNumber;
    }

    public double getContactNumber(){
        return this.contactNumber;
    }

}
