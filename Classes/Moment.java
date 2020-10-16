package com.company.Classes;

import java.util.Date;

public class Moment {
    private String Name;
    private Date Date;
    private String Description;
    private String Person;
    private String Country;

    public String getName() {
        return Name;
    }

    public Date getDate() {
        return Date;
    }

    public String getDescription() {
        return Description;
    }

    public String getPerson() {

        return Person;
    }

    public String getCountry() {

        return Country;
    }

    public Moment(String Name, Date Date, String Description, String Person, String Country) {
        this.Name = Name;
        this.Date = Date;
        this.Description = Description;
        this.Person = Person;
        this.Country = Country;
    }
}
