package com.WemersonWalcley.dsmovie.services;

import com.WemersonWalcley.dsmovie.dto.MovieDTO;
import com.WemersonWalcley.dsmovie.entities.Movie;
import com.WemersonWalcley.dsmovie.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.transform.Result;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Transactional(readOnly = true)
    public Page<MovieDTO> findAll(Pageable pageable){
        Page<Movie> pageMovie =  movieRepository.findAll(pageable);
        Page<MovieDTO> pageMovieDTO = pageMovie.map(x -> new MovieDTO(x));
        return pageMovieDTO;
    }

    @Transactional(readOnly = true)
    public MovieDTO findById(Long id){
        Movie movie =  movieRepository.findById(id).get();
        MovieDTO movieDTO = new MovieDTO(movie);
        return movieDTO;
    }

}
