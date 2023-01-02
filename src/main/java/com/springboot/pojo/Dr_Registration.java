package com.springboot.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dr_Registration {
	@Override
	public String toString() {
		return "Dr_Registration [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", login_id="
				+ login_id + ", password=" + password + ", email_id=" + email_id + ", mobile_no=" + mobile_no
				+ ", gender=" + gender + ", data_of_birth=" + data_of_birth + ", age=" + age + "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private	int id;
	public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public String getLogin_id() {
	return login_id;
}
public void setLogin_id(String login_id) {
	this.login_id = login_id;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail_id() {
	return email_id;
}
public void setEmail_id(String email_id) {
	this.email_id = email_id;
}
public String getMobile_no() {
	return mobile_no;
}
public void setMobile_no(String mobile_no) {
	this.mobile_no = mobile_no;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getData_of_birth() {
	return data_of_birth;
}
public void setData_of_birth(String data_of_birth) {
	this.data_of_birth = data_of_birth;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
	private String first_name, last_name, login_id, password,email_id,mobile_no,gender,data_of_birth,age;
	

	
}
