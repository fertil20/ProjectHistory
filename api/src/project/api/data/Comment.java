package project.api.data;

import java.sql.Date;

public class Comment {
    private String Text;
    private Date Date;
    private String Author; //Соотнести с Юзером?

    public String getText() {
        return Text;
    }

    public Date getDate() {
        return Date;
    }

    public String getAuthor() {
        return Author;
    }

    public Comment(String Text, Date Date, String Author) {
        this.Text = Text;
        this.Date = Date;
        this.Author = Author;
    }
}