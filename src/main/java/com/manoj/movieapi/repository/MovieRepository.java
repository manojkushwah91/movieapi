package com.manoj.movieapi.repository;

import com.manoj.movieapi.model.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class MovieRepository {
    private final List<Movie> movies = new ArrayList<>();
    private long nextId = 1;

    public Movie save(Movie movie) {
        movie.setId(nextId++);
        movies.add(movie);
        return movie;
    }

    public Optional<Movie> findById(Long id) {
        return movies.stream()
                .filter(movie -> movie.getId().equals(id))
                .findFirst();
    }

    public List<Movie> findAll() {
        return movies;
    }
}