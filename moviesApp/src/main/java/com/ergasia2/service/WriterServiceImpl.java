package com.ergasia2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ergasia2.dao.WriterDAO;
import com.ergasia2.model.Writer;

@Service
public class WriterServiceImpl implements WriterService {

    @Autowired
    private WriterDAO writerDAO;

    @Override
    @Transactional
    public void saveWriter(Writer theWriter) {
        writerDAO.saveWriter(theWriter);
    }

}    