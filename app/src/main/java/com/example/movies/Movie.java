package com.example.movies;

import com.google.gson.annotations.SerializedName;

public class Movie {

    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("description")
    private String description;
    @SerializedName("year")
    private int year;
    @SerializedName("poster")
    private Poster poster;
    @SerializedName("rating")
    private Rating rating;

    public Movie(Rating rating, Poster poster, int year, String description, String name, int id) {
        this.rating = rating;
        this.poster = poster;
        this.year = year;
        this.description = description;
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getYear() {
        return year;
    }

    public Poster getPoster() {
        return poster;
    }

    public Rating getRating() {
        return rating;
    }
}
