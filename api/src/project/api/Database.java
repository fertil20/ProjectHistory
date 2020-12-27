package project.api;

import project.api.data.Movie;

import java.sql.*;
import java.util.*;

public class Database {
    private final List<Movie> movies = new ArrayList<>();

    public List<Movie> getMovies() {
        return movies;
    }

    public void init() {
//        try {
//            Class.forName("org.postgresql.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//            System.exit(-1);
//        }

        try (final Connection connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5555/Movie?key=d37951be-eeea-4f0d-b8ef-dcb38a6f3822", "postgres", "admin")) {
            try (final Statement statement = connection.createStatement()) {

                try (final ResultSet resultSet = statement.executeQuery("select name, country, genre, duration, poster, description from first_table")) {
                    while (resultSet.next()) {
                        final String name = resultSet.getString("name");
                        // final Date release = resultSet.getDate("release");
                        final String country = resultSet.getString("country");
                        final String genre = resultSet.getString("genre");
                        final Time duration = resultSet.getTime("duration");
                        final String poster = resultSet.getString("poster");
                        // final String trailer = resultSet.getString("trailer");
                        final String description = resultSet.getString("description");
                        Movie o = new Movie();
                        o.setName(name);
                        //  o.setRelease(release);
                        o.setCountry(country);
                        o.setGenre(genre);
                        o.setDuration(duration);
                        o.setPoster(poster);
                        //  o.setTrailer(trailer);
                        o.setDescription(description);
                        movies.add(o);
                        System.out.println(name);
                        // System.out.println(release);
                        System.out.println(country);
                        System.out.println(genre);
                        System.out.println(duration);
                        System.out.println(poster);
                        // System.out.println(trailer);
                        System.out.println(description);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}