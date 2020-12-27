package project.api.data;

import java.io.Serializable;
import java.sql.Time;

public class Movie implements Serializable {
    private String Name;
   // private Date Release;
    private String Country;
    private String Genre;
    private Time Duration;
    private String Poster;
   // private String Trailer;
    private String Description;
    //private String Comment;
   // private String Person;
  //  private String Moment;
   // private String Mistake;

    public String getName() {
        return Name;
    }

    public String getCountry() {
        return Country;
    }

    //public String getComment() {
    //    return Comment;
    // }
  //  public String getPerson() {
  //      return Person;
 //   }

  //  public String getMoment() {
   //     return Moment;
  //  }

  //  public String getMistake() {
  //      return Mistake;
  //  }

  //  public Date getRelease() {
  //      return Release;
  //  }

    public String getDescription() {
        return Description;
    }

    public Time getDuration() {
        return Duration;
    }

    public String getPoster() {
        return Poster;
    }

  //  public String getTrailer() {
  //      return Trailer;
  //  }

    public String getGenre() {
        return Genre;
    }


  //  public void setMistake(String mistake) {
  //      Mistake = mistake;
  //  }

  //  public void setMoment(String moment) {
   //     Moment = moment;
  //  }

 //   public void setPerson(String person) {
 //       Person = person;
  //  }

    public void setDescription(String description) {
        Description = description;
    }

  //  public void setTrailer(String trailer) {
  //      Trailer = trailer;
  //  }

    public void setPoster(String poster) {
        Poster = poster;
    }

    public void setDuration(Time duration) {
        Duration = duration;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public void setCountry(String country) {
        Country = country;
    }

   // public void setRelease(Date release) {
  //      Release = release;
  //  }

    public void setName(String name) {
        Name = name;
    }

}