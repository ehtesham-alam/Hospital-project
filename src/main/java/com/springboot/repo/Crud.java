package com.springboot.repo;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.pojo.Admin_Login;

public interface Crud extends CrudRepository<Admin_Login, Integer>
{
	
	public Admin_Login findBypassword(String password);

	//public List<Admin_Login> findBypasswordAndlogin_id(String password, String login_id);

	//public List<Admin_Login> findByloginAndpassword(String login, String password);

	
}
