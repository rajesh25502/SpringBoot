package com.demo.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer
{
    //@JsonProperty("id")// To customise the name of jason property

    private int cid;
    private  String fname;
    private String lname;
    private String email;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
