package com.rating.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "belegung_einzeln")
public class Single_Assignment {
	@Column(name="iz_kuerzel")
	private String username;
	@Column(name="matrk_num")
	private int student_number;
	@Column(name="bezeichnung_kurs")
	private String course_title;
	@Column(name="semester_kurs")
	private String semester;
	@Column(name="einzeln_kriterium")
	private String criteria;
	@Column(name="einzeln_note")
	private double individual_mark;
	
	public Single_Assignment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Single_Assignment(String username, int student_number, String course_title, String semester, String criteria,
			double individual_mark) {
		super();
		this.username = username;
		this.student_number = student_number;
		this.course_title = course_title;
		this.semester = semester;
		this.criteria = criteria;
		this.individual_mark = individual_mark;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getStudent_number() {
		return student_number;
	}

	public void setStudent_number(int student_number) {
		this.student_number = student_number;
	}

	public String getCourse_title() {
		return course_title;
	}

	public void setCourse_title(String course_title) {
		this.course_title = course_title;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getCriteria() {
		return criteria;
	}

	public void setCriteria(String criteria) {
		this.criteria = criteria;
	}

	public double getIndividual_mark() {
		return individual_mark;
	}

	public void setIndividual_mark(double individual_mark) {
		this.individual_mark = individual_mark;
	}

	@Override
	public String toString() {
		return "Single_Assignment [username=" + username + ", student_number=" + student_number + ", course_title="
				+ course_title + ", semester=" + semester + ", criteria=" + criteria + ", individual_mark="
				+ individual_mark + "]";
	}
}
