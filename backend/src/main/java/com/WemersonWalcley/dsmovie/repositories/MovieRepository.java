package com.WemersonWalcley.dsmovie.repositories;

import com.WemersonWalcley.dsmovie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
