package com.ergasia2.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ergasia2.dao.UserBookmarkDAO;
import com.ergasia2.dao.UserDAO;
import com.ergasia2.model.User;
import com.ergasia2.model.UserBookmark;

@Service
public class UserBookmarkServiceImpl implements UserBookmarkService {

    @Autowired
    private UserBookmarkDAO UserBookmarkServiceDAO;

    @Override
    @Transactional
    public void saveUserBookmark(UserBookmark theUserBookmark) {
    	UserBookmarkServiceDAO.saveUserBookmark(theUserBookmark);
    }

}
    