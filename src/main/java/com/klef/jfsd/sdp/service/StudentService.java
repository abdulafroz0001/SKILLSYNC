package com.klef.jfsd.sdp.service;

import java.util.List;

import com.klef.jfsd.sdp.model.Student;



public interface StudentService
{
	public String addStudent(Student st);
	public Student viewStudentById(int stid);
	public List<Student>viewAllStudent();
	public Student studentLogin(String susername,String spassword);
	public Student checkStudentUsername(String susername);
}
