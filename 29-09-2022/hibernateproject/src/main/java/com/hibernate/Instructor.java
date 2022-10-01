package com.hibernate;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Instructor {
	@Id
	private int insId;
	private String insName;
	
	//one instructor can take many courses
	@OneToMany(mappedBy = "instructor",cascade = CascadeType.ALL)
	
	List<Course> courses;

	public int getInsId() {
		return insId;
	}

	public void setInsId(int insId) {
		this.insId = insId;
	}

	public String getInsName() {
		return insName;
	}

	public void setInsName(String insName) {
		this.insName = insName;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Instructor [insId=" + insId + ", insName=" + insName + ", courses=" + courses + "]";
	}

	public Instructor(int insId, String insName, List<Course> courses) {
		super();
		this.insId = insId;
		this.insName = insName;
		this.courses = courses;
	}

	public Instructor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}