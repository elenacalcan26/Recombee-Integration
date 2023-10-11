package dataset;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private List<String> genre;
    private String description;
    private String director;
    private List<String> actors;
    private int year;
    private int runtime;
    private double rating;
    private long votes;
    private double revenue;
    private int metascore;

    public Movie(String title,
                 List<String> genre,
                 String description,
                 String director,
                 List<String> actors,
                 int year,
                 int runtime,
                 double rating,
                 long votes,
                 double revenue,
                 int metascore) {
        this.title = title;
        this.genre = new ArrayList<>(genre);
        this.description = description;
        this.director = director;
        this.actors = new ArrayList<>(actors);
        this.year = year;
        this.runtime = runtime;
        this.rating = rating;
        this.votes = votes;
        this.revenue = revenue;
        this.metascore = metascore;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }

    public String getDirector() {
        return director;
    }

    public List<String> getActors() {
        return actors;
    }

    public int getYear() {
        return year;
    }

    public int getRuntime() {
        return runtime;
    }

    public double getRating() {
        return rating;
    }

    public long getVotes() {
        return votes;
    }

    public double getRevenue() {
        return revenue;
    }

    public int getMetascore() {
        return metascore;
    }
}
