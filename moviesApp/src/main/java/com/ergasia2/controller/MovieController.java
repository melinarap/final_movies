package com.ergasia2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ergasia2.model.User;
import com.ergasia2.service.UserService;

@Controller
@RequestMapping("/movie") {
	
	@Autowired
    //many services
	
	 @PostMapping("/add")
	    public String addMovie(String title, String Director Name, String DirectorSurname) {
	        
	        return "redirect:/index.jsp";
	    }
}
