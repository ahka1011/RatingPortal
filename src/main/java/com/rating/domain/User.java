package com.rating.domain;

import java.util.List;

import com.rating.rest.DatabaseConnector;

/**
 * Represents and describes a user.
 * Authentication of user in {@link com.rating.rest.LDAP_Entry#findUser(String, String)}.
 * When authentication is successful, attributes will be filled with user-related data from LDAP.
 * 
 * @see com.rating.rest.LDAP_Entry
 * 
 * @author Burcu Kulaksiz
 *
 */
public class User {

	private String firstname;
	private String lastname;
	private String email;
	private String username;
	private String role;
	public static final String STUDENT = "Student";
	public static final String PROFESSOR = "Professor";
	List<Course> myCourses;
	private Token token;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String firstname, String lastname, String email, String username, String role, Token token) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.username = username;
		this.role = role;
		this.myCourses = DatabaseConnector.searchforCoursesbyUsername(username);
		this.token = token;
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<Course> getMyCourses() {
		return myCourses;
	}

	public void setMyCourses(List<Course> myCourses) {
		this.myCourses = myCourses;
	}

	public Token getToken() {
		return token;
	}

	public void setToken(Token token) {
		this.token = token;
	}

	public static String getStudent() {
		return STUDENT;
	}

	public static String getProfessor() {
		return PROFESSOR;
	}

	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", username=" + username
				+ ", role=" + role + ", token=" + token + "]";
	}
}
