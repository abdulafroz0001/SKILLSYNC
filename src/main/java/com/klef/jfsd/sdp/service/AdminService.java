package com.klef.jfsd.sdp.service;

import java.util.List;

import com.klef.jfsd.sdp.model.Admin;
import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.Faculty;
import com.klef.jfsd.sdp.model.Student;

public interface AdminService 
{
	public String addFaculty(Faculty f);
	public String addCourse(Course c);
	public String addStudent(Student st);
	public List<Course> viewAllCourses();
	public List<Faculty> viewAllFaculty();
	public List<Student> viewAllStudents();
	public Admin adminLogin(String ausername,String apassword);
	public Admin checkAdminUsername(String username);

}
