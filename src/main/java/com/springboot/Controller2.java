package com.springboot;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.pojo.Admin_Login;
import com.springboot.pojo.Dr_Registration;
import com.springboot.pojo.Login;
import com.springboot.repo.Crud;
import com.springboot.service.Admin_Service;

@Controller
public class Controller2 {
	 @Autowired
	 Admin_Login admin_Login;
 @Autowired
 Admin_Service service;
 @Autowired
 Crud crud;

	@RequestMapping(value = "/admin_logined") 
	public ModelAndView adminLogined( @RequestParam("password") String password, @RequestParam("login") String login   )
	{
		
		  ModelAndView adminlogined = service.adminlogined(password,login);
		
		return adminlogined;
			  
			 
		 
	 
	 
	}
}
