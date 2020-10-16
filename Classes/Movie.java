package com.company.Classes;

import javax.print.attribute.standard.Media;
import java.awt.*;
import java.sql.Time;
import java.util.Date;

public class Movie {
    private String Name;
    private Date Release;
    private String Country;
    private String Genre;
    private Time Duration;
    private Image Poster;
    private Media Trailer;
    private String Description;
    private String Comment;
    private String Person;
    private String Moment;
    private String Mistake;

    public String getName() {
        return Name;
    }
    public String getCountry() {
        return Country;
    }
    public String getComment() {
        return Comment;
    }
    public String getPerson() {
        return Person;
    }
    public String getMoment() {
        return Moment;
    }
    public String getMistake() {
        return Mistake;
    }
    public Date getRelease() {
        return Release;
    }
    public String getDescription() {
        return Description;
    }
    public Time getDuration() {
        return Duration;
    }
    public Image getPoster() {
        return Poster;
    }
    public Media getTrailer() {
        return Trailer;
    }
    public String getGenre() {
        return Genre;
    }

    public Movie(String Name, Date Release, String Country, Time Duration, Image Poster, Media Trailer, String Description,
                 String Comment, String Person, String Moment, String Mistake, String Genre) {
        this.Name = Name;
        this.Release = Release;
        this.Country = Country;
        this.Duration = Duration;
        this.Poster = Poster;
        this.Trailer = Trailer;
        this.Description = Description;
        this.Comment = Comment; // надо нормально переделать комментарии, ибо комментов у фильмов много
        this.Person = Person;
        this.Moment = Moment;
        this.Mistake = Mistake;
        this.Genre = Genre;
    }
}