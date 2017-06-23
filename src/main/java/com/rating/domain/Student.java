package com.rating.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="student")
public class Student {
	@Id
	@Column(name="iz_kuerzel")
	private String username;
	@Column(name="vorname")
	private String firstname;
	@Column(name="nachname")
	private String lastname;
	@Column(name="matrk_num")
	private int student_number;
	@Column(name="email_adresse")
	private String email;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String username, String firstname, String lastname, int student_number, String email) {
		super();
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.student_number = student_number;
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

	public int getStudent_number() {
		return student_number;
	}

	public void setStudent_number(int student_number) {
		this.student_number = student_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [username=" + username + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", student_number=" + student_number + ", email=" + email + "]";
	}
}