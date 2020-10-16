package com.company.Classes;

import java.util.Date;

public class Person {
    private String Name;
    private String Activity;
    private Date Birth;
    private Date Death;
    private String Homeland;
    private String Moment;

    public String getName() {
        return Name;
    }

    public String getActivity() {
        return Activity;
    }

    public Date getBirth() {
        return Birth;
    }

    public Date getDeath() {

        return Death;
    }

    public String getHomeland() {

        return Homeland;
    }

    public String getMoment() {

        return Moment;
    }

    public Person(String Name, String Activity, Date Birth, Date Death, String Homeland, String Moment) {
        this.Name = Name;
        this.Activity = Activity;
        this.Birth = Birth;
        this.Death = Death;
        this.Homeland = Homeland;
        this.Moment = Moment;
    }
}
