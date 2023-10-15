package com.klef.jfsd.sdp.service;

import java.util.List;

import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.Faculty;

public interface AdminService 
{
	public String addFaculty(Faculty f);
	public String addCourse(Course c);
	
	public List<Course> viewAllCourses();

}
