package com.klef.jfsd.sdp.model;

public class Course 
{
	private int id;
	private String name;
	private String course_code;
	private String description;
	private int credits;
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
				+ ", credits=" + credits + ", department=" + department + "]";
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", course_code=" + course_code + ", description=" + description
				+ ", credits=" + credits + "]";
	}
	
}
