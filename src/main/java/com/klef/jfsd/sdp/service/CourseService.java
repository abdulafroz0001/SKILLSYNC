package com.klef.jfsd.sdp.service;

import java.util.List;

import com.klef.jfsd.sdp.model.Course;

public interface CourseService 
{
	public String addCourse(Course c);
	public List<Course>viewAllCourse();
	public Course viewCourseById(int cid);
	
}
