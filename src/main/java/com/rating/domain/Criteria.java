package com.rating.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Criteria")
public class Criteria {
	@Id
	@Column(name="bezeichnung")
	private String description;
	@Column(name="gewichtung")
	private double weighting;
	@Column(name="gruppen_nr")
	private int group_nr;

	public Criteria() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Criteria(String description, double weighting, int group_nr) {
		super();
		this.description = description;
		this.weighting = weighting;
		this.group_nr = group_nr;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
		return "Criteria [description=" + description + ", weighting=" + weighting + ", group_nr=" + group_nr
				+ "]";
	}
}
