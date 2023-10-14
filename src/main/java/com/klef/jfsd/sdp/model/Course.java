package com.klef.jfsd.sdp.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "course_table")
public class Course 
{
	@Id
	@GeneratedValue
	@Column(name="course_id")
	private int id;
	@Column(name = "course_fullname",nullable=false)
	private String name;
	@Column(name = "course_code",nullable=false)
	private String course_code;

	@Column(name = "course_description",nullable = false)

	private String description;
	@Column(name="course_credits")
	private int credits;

	@Column(name="course_department",nullable = false)
	private String department;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse_code() {
		return course_code;
	}
	public void setCourse_code(String course_code) {
		this.course_code = course_code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", course_code=" + course_code + ", description=" + description
				+ ", credits=" + credits + "]";
	}
	
}
