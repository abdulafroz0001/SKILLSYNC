package com.klef.jfsd.sdp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "faculty_table")
public class Faculty 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="fac_id")
	private int id;
	@Column(name = "fac_fullname", nullable = false)
	private String fullname;
	@Column(name = "fac_gender", nullable = false)
	private String gender;
	@Column(name = "fac_dateofbirth",nullable = false)
	private String dateofbirth;
	@Column(name = "fac_department",nullable = false)
	private String department;
	@Column(name = "fac_course",nullable = false)
	private String course;
	@Column(name="fac_salary", nullable = false)
	private double salary;
	@Column(name="fac_email", nullable = false)
	private String email;
	@Column(name="fac_contactno", nullable = false)
	private String contactno;
	@Column(name="fac_username", nullable = false)
	private String username;
	@Column(name="fac_password", nullable = false)
	private String password;
	@Column(name="fac_secQuestion", nullable = false)
	private String securityQuestion;
	@Column(name="fac_secAnswer", nullable = false)
	private String secAnswer;
	
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
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
	public String getSecurityQuestion() {
		return securityQuestion;
	}
	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}
	public String getSecAnswer() {
		return secAnswer;
	}
	public void setSecAnswer(String secAnswer) {
		this.secAnswer = secAnswer;
	}
}
