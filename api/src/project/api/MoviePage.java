package project.api;

import javax.swing.*;

public class MoviePage extends JDialog {
    private JPanel Filmname;
    private JPanel Country;
    private JTextArea description;
    private JTextField genre;
    private JTextField duration;
    public JPanel contentPane1;
    private JLabel filmName;
    private JLabel countryName;

    public void setDescription(String description) {
        this.description.setText(description);
    }

    public void setGenre(String genre) {
        this.genre.setText(genre);
    }

    public void setDuration(String duration) {
        this.duration.setText(duration);
    }

    public void setFilmName(String filmName) {
        this.filmName.setText(filmName);
    }

    public void setCountryName(String countryName) {
        this.countryName.setText(countryName);
    }

    public MoviePage() {
        setContentPane(contentPane1);
        setModal(true);
    }
}
