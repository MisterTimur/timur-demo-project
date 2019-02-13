package com.example.timurdemoproject.rest;

import com.example.timurdemoproject.model.Movie;
import com.example.timurdemoproject.repo.MovieRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class MovieRestController {

    MovieRepository movieRepository;

    public MovieRestController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping("movie/{id}")
    public MovieDTO getMovie(@PathVariable("id") String id){
        Movie movie = movieRepository.findById(id);
        return new MovieDTO(movie.getMovie_name(),movie.getMovie_info());
    }

    @PostMapping("add-movie")
    public String saveMovie(@RequestBody MovieDTO movieDTO){

        return movieRepository.save(
                    new Movie(movieDTO.getName(), movieDTO.getInfo()))
                .getMovie_id();
    }
}
