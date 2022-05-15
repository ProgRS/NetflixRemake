package me.dio.netflixremake.model;

import java.util.List;

public class Category {

    private String name;
    private List<Movie> movies;

    public String getName() {
        return name;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
