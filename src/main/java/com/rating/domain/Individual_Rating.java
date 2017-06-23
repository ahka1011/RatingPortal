package com.rating.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="einzel_berechnung")
public class Individual_Rating {
	@Column(name="bezeichnung")
	private String title;
	@Column(name="einzel_note")
	private double individual_mark;
	@Column(name="gewichtung")
	private double weighting;
	@Column(name="ergebnis")
	private double overall_mark;
	@Column(name="matrk_num")
	private int student_number;
	@Column(name="kurs_nr")
	private int course_nr;
	@Column(name="gruppen_nr")
	private int group_nr;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getIndividual_Mark() {
		return individual_mark;
	}
	public void setIndividual_Mark(double individual_mark) {
		this.individual_mark = individual_mark;
	}
	public double getWeighting() {
		return weighting;
	}
	public void setWeighting(double weighting) {
		this.weighting = weighting;
	}
	public double getOverall_Mark() {
		return overall_mark;
	}
	public void setOverall_Mark(double overall_mark) {
		this.overall_mark = overall_mark;
	}
	public int getStudent_number() {
		return student_number;
	}
	public void setStudent_number(int student_number) {
		this.student_number = student_number;
	}
	public int getCourse_nr() {
		return course_nr;
	}
	public void setCourse_nr(int course_nr) {
		this.course_nr = course_nr;
	}
	public int getGroup_nr() {
		return group_nr;
	}
	public void setGroup_nr(int group_nr) {
		this.group_nr = group_nr;
	}
	public Individual_Rating(String title, double individual_mark, double weighting, double overall_mark, int student_number,
			int course_nr, int group_nr) {
		super();
		this.title = title;
		this.individual_mark = individual_mark;
		this.weighting = weighting;
		this.overall_mark = overall_mark;
		this.student_number = student_number;
		this.course_nr = course_nr;
		this.group_nr = group_nr;
	}
	
	public Individual_Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Individual_Rating [title=" + title + ", individual_mark=" + individual_mark + ", weighting=" + weighting
				+ ", overall_mark=" + overall_mark + ", student_number=" + student_number + ", course_nr=" + course_nr
				+ ", group_nr=" + group_nr + "]";
	}
}
