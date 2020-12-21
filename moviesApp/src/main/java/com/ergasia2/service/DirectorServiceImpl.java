package com.ergasia2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ergasia2.dao.DirectorDAO;
import com.ergasia2.model.Director;

@Service
public class DirectorServiceImpl implements DirectorService {

    @Autowired
    private DirectorDAO directorDAO;

    @Override
    @Transactional
    public void saveDirector(Director theDirector) {
        directorDAO.saveDirector(theDirector);
    }

}     