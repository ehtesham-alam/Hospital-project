package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.pojo.Dr_Registration;
import com.springboot.pojo.Login;
import com.springboot.repo.Crud;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	Crud crud;
	@Autowired
	Login login;
	@RequestMapping("/home")
	public String home()
	{
		return "home" ;
	}
	
	/* Our Specialities.................*/ 
	
	@RequestMapping("/cardiac")
	public String cardiac()
	{
		return "cardiac" ;
	}

	@RequestMapping("/neurology")
	public String neurology()
	{
		return "neurology" ;
	}
	
	@RequestMapping("/internal_medicine")
	public String internal_medicine()
	{
		return "internal_medicine" ;
	}
	
	@RequestMapping("/pediatrics")
	public String pediatrics()
	{
		return "pediatrics" ;
	}
	
	@RequestMapping("/dentistry")
	public String dentistry()
	{
		return "dentistry" ;
	}
	@RequestMapping("/physiotherapy")
	public String physiotherapy()
	{
		return "physiotherapy" ;
	}
	@RequestMapping("/oncology")
	public String oncology()
	{
		return "oncology" ;
	}
	
	@RequestMapping("/anesthesiology")
	public String anesthesiology()
	{
		return "anesthesiology" ;
	}

	@RequestMapping("/psychiatry")
	public String psychiatry()
	{
		System.out.println("helo");
		return "psychiatry" ;
	}
	
	  @RequestMapping("/icu") 
	  public String icu() 
	  { return "icu" ; }
	  
	  @RequestMapping("/gynaecology") 
	  public String gynaecology() 
	  { return "gynaecology" ; }
	  
	  @RequestMapping("/dermatology") 
	  public String dermatology() 
	  { return "dermatology" ; }
	  
		/* our Doctor.................... */
	  
	  @RequestMapping("/doctor") public String doctor() { return
	  "doctor" ; }
	  
	  @RequestMapping("/doctor_registration") public String doctor_registration() { return
	  "doctor_registration" ; }
	  
	  @RequestMapping("/doctor_login") 
	  public String doctor_login()
	  { 
		  return  "doctor_login"; }
	  
	  /* Facilities.................... */
	  
	  @RequestMapping("/emergency_service") public String emergency_service() { return
	  "emergency_service" ; }
	  
	  @RequestMapping("/diagnostics_service") public String diagnostics_service() { return
	  "diagnostics_service" ; }
	  
	  @RequestMapping("/cathlab") public String cathlab() { return
	  "cathlab" ; }
	  
	  @RequestMapping("/operation_theater") public String operation_theater() { return
	  "operation_theater" ; }
	  
	  @RequestMapping("/dialysis_centre") public String dialysis_centre() { return
	  "dialysis_centre" ; }
	 
	  @RequestMapping("/intensive") public String intensive() { return
			  "intensive" ; }
	  
	  
		/* Online Appointment............... */
	  
	  @RequestMapping("/appointment") 
	  public String online_appointment() 
	      { 
		  return  "online_appointment" ; 
		  }
	 
	  /* contact............... */
	  
	  @RequestMapping("/contact") 
	  public String  contact() 
	      { 
		  return  "contact" ; 
		  }
	  
	  /* admin............... */
	  
	  @RequestMapping("/admin") 
	  public String  admin() 
	      { 
		  return  "adminlogin" ; 
		  }

}
