package com.ergasia2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ergasia2.dao.UserDAO;
import com.ergasia2.model.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    @Transactional
    public void saveUser(User theUser) {
        userDAO.saveUser(theUser);
    }

}
    