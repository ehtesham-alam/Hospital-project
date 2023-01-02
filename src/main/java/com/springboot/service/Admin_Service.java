package com.springboot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.pojo.Admin_Login;
import com.springboot.repo.Crud;

@Service
public class Admin_Service {
@Autowired
Crud crud;

public ModelAndView adminlogined(String password ,String login)
{ 
	{
		ModelAndView mView=new ModelAndView();
		 
		try {
			Admin_Login findBypassword1 = crud.findBypassword( password);

		System.out.println(findBypassword1);
			
			  if(password.equals(findBypassword1.getPassword()))
			  { 
				  if(login.equals(findBypassword1.getLogin())) {
			  mView.setViewName("adminloginedpage");
			  mView.addObject("adminname",findBypassword1 ); return mView;
				  }
				  else {
					  mView.addObject("invalid", "invalid admin id and password");
					  mView.setViewName("adminlogin"); 
					  return mView; 
				  }
			    } 
			
		} catch (Exception e) {
			 mView.addObject("invalid", "invalid admin id and password");
			  mView.setViewName("adminlogin"); 
			  return mView; 
		}
		return mView; 
 
}
	
}
}
