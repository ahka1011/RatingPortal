package com.rating.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="professor")
public class Professor {
	@Id
	@Column(name="iz_kuerzel")
	private String username;
	@Column(name="vorname")
	private String forename;
	@Column(name="nachname")
	private String surname;
	@Column(name="email_adresse")
	private String email;
	
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Professor(String username, String forename, String surname, String email) {
		super();
		this.username = username;
		this.forename = forename;
		this.surname = surname;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Professor [username=" + username + ", forename=" + forename + ", surname=" + surname + ", email="
				+ email + "]";
	}
}
