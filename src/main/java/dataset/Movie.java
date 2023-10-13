package dataset;

import com.opencsv.bean.CsvBindByName;

public class Movie {
    @CsvBindByName
    private int rank;

    @CsvBindByName
    private String title;

    @CsvBindByName
    private String genre;
    @CsvBindByName
    private String description;
    @CsvBindByName
    private String director;
    @CsvBindByName
    private String actors;
    @CsvBindByName
    private int year;
    @CsvBindByName(column = "Runtime (Minutes)")
    private int runtime;
    @CsvBindByName
    private double rating;
    @CsvBindByName
    private long votes;
    @CsvBindByName(column = "Revenue (Millions)")
    private double revenue;
    @CsvBindByName
    private int metascore;

    public Movie() {}

    public int getRank() { return rank; }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }

    public String getDirector() {
        return director;
    }

    public String getActors() {
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
