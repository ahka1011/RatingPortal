package com.rating.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="gruppe")
public class Group {
	@Id
	@Column(name="gruppen_nr")
	private int group_nr;
	@Column(name="bezeichnung")
	private String title;
	@Column(name="kurs_nr")
	private int course_nr;
	
	public Group() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Group(int group_nr, String title, int course_nr) {
		super();
		this.group_nr = group_nr;
		this.title = title;
		this.course_nr = course_nr;
	}
	public int getGroup_nr() {
		return group_nr;
	}
	public void setGroup_nr(int group_nr) {
		this.group_nr = group_nr;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCourse_nr() {
		return course_nr;
	}
	public void setCourse_nr(int course_nr) {
		this.course_nr = course_nr;
	}
	@Override
	public String toString() {
		return "Group [groupn_nr=" + group_nr + ", title=" + title + ", course_nr=" + course_nr + "]";
	}
}
