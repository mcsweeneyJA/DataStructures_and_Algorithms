package com.company;

public class Movie {
    String title;
    String starring;
    String director;
    int duration;
    String genre;
    String classification;
    int date;

    public Movie(String movietitle, String movieStarring, String movieDirector, int movieDuration, String movieGenre, String movieClassification, int movieDate){
        title = movietitle;
        starring = movieStarring;
        director = movieDirector;
        duration = movieDuration;
        genre = movieGenre;
        classification = movieClassification;
        date = movieDate;
    }


}
