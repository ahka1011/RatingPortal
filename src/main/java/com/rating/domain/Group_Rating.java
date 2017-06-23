package com.rating.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="gruppen_berechnung")
public class Group_Rating {
	@Column(name="iz_kuerzel")
	private String username;
	@Column(name="gruppen_nr")
	private int group_nr;
	@Column(name="kurs_nr")
	private int course_nr;
	@Column(name="gruppen_note")
	private double group_mark;

	public Group_Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getGroup_nr() {
		return group_nr;
	}
	public void setGroup_nr(int group_nr) {
		this.group_nr = group_nr;
	}
	public int getCourse_nr() {
		return course_nr;
	}
	public void setCourse_nr(int course_nr) {
		this.course_nr = course_nr;
	}
	public double getGroup_mark() {
		return group_mark;
	}
	public void setGroup_mark(double group_mark) {
		this.group_mark = group_mark;
	}
	public Group_Rating(String username, int group_nr, int course_nr, double group_mark) {
		super();
		this.username = username;
		this.group_nr = group_nr;
		this.course_nr = course_nr;
		this.group_mark = group_mark;
	}
	@Override
	public String toString() {
		return "Group_Rating [username=" + username + ", group_nr=" + group_nr + ", course_nr=" + course_nr
				+ ", group_mark=" + group_mark + "]";
	}
}
