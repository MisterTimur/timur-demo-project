package com.example.timurdemoproject.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "movie_table")
public class Movie {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "movie_id")
    private String movie_id;
    @Column(name = "movie_name", length = 50, nullable = false)
    private String movie_name;
    @Column(name = "movie_info", length = 50, nullable = false)
    private String movie_info;

    public Movie() {

    }
    public Movie(String movie_name, String movie_info) {
        this.movie_name = movie_name;
        this.movie_info = movie_info;
    }

    public String getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(String movie_id) {
        this.movie_id = movie_id;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getMovie_info() {
        return movie_info;
    }

    public void setMovie_info(String movie_info) {
        this.movie_info = movie_info;
    }
}
