package com.rating.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 
 * @author Son Hai Hoang
 * The Domainclass "Template" maps the courses which were created by professors.
 *
 */

@Entity(name="kursvorlage")
public class Template {
	@Id
	@Column(name="kurs_nr")
	private int course_nr;
	@Column(name="bezeichnung_kurs")
	private String course_title;
	@Column(name="semester_kurs")
	private String semester;
	@Column(name="iz_kuerzel")
	private String username;
	
	public Template() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	/**
	 *Class Constuctor Template with an initialisation of the Attributes: course_nr, course_title, semester and username 
	 */
	
	public Template(int course_nr, String course_title, String semester, String username) {
		super();
		this.course_nr = course_nr;
		this.course_title = course_title;
		this.semester = semester;
		this.username = username;
	}

	public int getCourse_nr() {
		return course_nr;
	}

	public void setCourse_nr(int course_nr) {
		this.course_nr = course_nr;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Template [course_nr=" + course_nr + ", course_title=" + course_title + ", semester=" + semester
				+ ", username=" + username + "]";
	}
}
