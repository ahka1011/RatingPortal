package com.rating.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Represents the role of the professor.
 * @author Tolga Duman
 *
 */

@Entity(name="professor")
public class Professor {
	@Id
	@Column(name="iz_kuerzel")
	private String username;
	@Column(name="vorname")
	private String firstname;
	@Column(name="nachname")
	private String lastname;
	@Column(name="email_adresse")
	private String email;
	
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	/**
	 * Class constructor. 
	 * @param username is the unique personified ID of a professor
	 * @param firstname is the firstname of a professor
	 * @param lastname is the lastname of a professor
	 * @param email is the email of a professor
	 */
	
	public Professor(String username, String firstname, String lastname, String email) {
		super();
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	@Override
	public String toString() {
		return "Professor [username=" + username + ", firstname=" + firstname + ", lastname=" + lastname + ", email="
				+ email + "]";
	}

	public Object size() {
		// TODO Auto-generated method stub
		return null;
	}
}
