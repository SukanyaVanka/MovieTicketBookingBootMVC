package com.movieticket.booking.models;

public class Theatre {

    private String theatreName, city;
    private int zipcode;

    public Theatre() {
    }

    public Theatre(String theatreName, String city, int zipcode) {
        this.theatreName = theatreName;
        this.city = city;
        this.zipcode = zipcode;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
}
