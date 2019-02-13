package com.example.timurdemoproject.repo;

import com.example.timurdemoproject.model.Movie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@RepositoryDefinition(domainClass = Movie.class, idClass = Long.class)
public interface MovieRepository {

    @Query("select m from Movie m where m.movie_id = :id")
    Movie findById(@Param("id")String id);

    Movie save(Movie movie);
}
