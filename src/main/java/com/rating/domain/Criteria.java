package com.rating.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Criteria")
public class Criteria {
	@Id
	@Column(name="bezeichnung")
	private String title;
	@Column(name="gewichtung")
	private double weighting;
	@Column(name="gruppen_nr")
	private int group_nr;

	public Criteria() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Criteria(String title, double weighting, int group_nr) {
		super();
		this.title = title;
		this.weighting = weighting;
		this.group_nr = group_nr;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getWeighting() {
		return weighting;
	}
	public void setWeighting(double weighting) {
		this.weighting = weighting;
	}
	public int getGroup_nr() {
		return group_nr;
	}
	public void setGroup_nr(int group_nr) {
		this.group_nr = group_nr;
	}
	@Override
	public String toString() {
		return "Criteria [title=" + title + ", weighting=" + weighting + ", group_nr=" + group_nr
				+ "]";
	}
}
