package com.klef.jfsd.sdp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_table")
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="stu_id")
	private int id;
	@Column(name = "stu_fullname", nullable = false)
	private String fullname;
	@Column(name = "stu_gender", nullable = false)
	private String gender;
	@Column(name = "stu_dateofbirth",nullable = false)
	private String dateofbirth;
	@Column(name = "stu_department",nullable = false)
	private String department;
	@Column(name = "stu_curent_year",nullable = false)
	private String current_year;
	@Column(name="stu_cgpa", nullable = false)
	private double cgpa;
	@Column(name="stu_email", nullable = false)
	private String email;
	@Column(name="stu_contactno", nullable = false)
	private String contactno;
	@Column(name="stu_username", nullable = false)
	private String username;
	@Column(name="stu_password", nullable = false)
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCurrent_year() {
		return current_year;
	}
	public void setCurrent_year(String current_year) {
		this.current_year = current_year;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
