package com.ergasia2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ergasia2.dao.MovieDAO;
import com.ergasia2.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieDAO movieDAO;

    @Override
    @Transactional
    public void saveMovie(Movie theMovie) {
        movieDAO.saveMovie(theMovie);
    }

}