package com.rating.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="group")
public class Group {
	@Id
	@Column(name="gruppen_nr")
	private int group_nr;
	@Column(name="bezeichnung")
	private String description;
	@Column(name="kurs_nr")
	private int course_nr;
	
	public Group() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Group(int group_nr, String description, int course_nr) {
		super();
		this.group_nr = group_nr;
		this.description = description;
		this.course_nr = course_nr;
	}
	public int getGroup_nr() {
		return group_nr;
	}
	public void setGroup_nr(int group_nr) {
		this.group_nr = group_nr;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCourse_nr() {
		return course_nr;
	}
	public void setCourse_nr(int course_nr) {
		this.course_nr = course_nr;
	}
	@Override
	public String toString() {
		return "Group [groupn_nr=" + group_nr + ", description=" + description + ", course_nr=" + course_nr + "]";
	}
}
