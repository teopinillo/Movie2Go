package me.theofrancisco.movie2go;

public class Movie {

    private String title;
    private String poster_path;
    private String original_language;
    private String overview;
    private String release_date;
    private double vote_average;  //6.6

    public Movie(String title, String poster_path, String original_language, String overview, String release_date, double vote_average) {
        this.title = title;
        this.poster_path = poster_path;
        this.original_language = original_language;
        this.overview = overview;
        this.release_date = release_date;
        this.vote_average = vote_average;
    }

    public String getTitle() {
        return title;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public String getOverview() {
        return overview;
    }

    public String getRelease_date() {
        return release_date;
    }

    public double getVote_average() {
        return vote_average;
    }

}
