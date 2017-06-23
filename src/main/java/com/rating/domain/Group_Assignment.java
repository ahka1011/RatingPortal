package com.rating.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="belegung_gruppe")
public class Group_Assignment {
	@Column(name="gruppen_nr")
	private int group_nr;
	@Column(name="matrk_num")
	private int student_number;
	@Column(name="bezeichnung_kurs")
	private String course_title;
	@Column(name="semester_kurs")
	private String semester;
	@Column(name="kurs_nr")
	private int course_nr;
	@Column(name="gruppe_note")
	private double group_mark;
	
	public Group_Assignment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Group_Assignment(int group_nr, int student_number, String course_title, String semester, int course_nr,
			double group_mark) {
		super();
		this.group_nr = group_nr;
		this.student_number = student_number;
		this.course_title = course_title;
		this.semester = semester;
		this.course_nr = course_nr;
		this.group_mark = group_mark;
	}

	public int getGroup_nr() {
		return group_nr;
	}

	public void setGroup_nr(int group_nr) {
		this.group_nr = group_nr;
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

	@Override
	public String toString() {
		return "Group_Assignment [group_nr=" + group_nr + ", student_number=" + student_number + ", course_title="
				+ course_title + ", semester=" + semester + ", course_nr=" + course_nr + ", group_mark=" + group_mark
				+ "]";
	}
}
