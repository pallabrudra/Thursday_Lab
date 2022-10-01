package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="course_info")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int courseId;
	
	@Column(name="course_name",length=50)
	String courseName;
	
	@Column(name="course_duration", length = 50)
	String courseDuration;
	
	@ManyToOne //many courses can be taken by one instructor
	@JoinColumn(name = "insId")
	private Instructor instructor;
	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}



	public String getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}



	public Course( String courseName, String courseDuration) {
		super();
		this.courseName = courseName;
		this.courseDuration = courseDuration;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}	
