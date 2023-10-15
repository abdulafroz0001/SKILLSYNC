package com.klef.jfsd.sdp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.Faculty;
import com.klef.jfsd.sdp.repository.CourseRepository;
import com.klef.jfsd.sdp.repository.FacultyRepository;

@Service
public class AdminServiceImpl implements AdminService 
{
	
	@Autowired
	FacultyRepository facultyRepository;
	
	@Autowired
	CourseRepository courseRepository;

	@Override
	public String addFaculty(Faculty f) {
		facultyRepository.save(f);
		return "Faculty Addedd Successfully ...";
	}

	@Override
	public String addCourse(Course c) {
		courseRepository.save(c);
		return "Course Added Successfully";
	}

	@Override
	public List<Course> viewAllCourses() {
		
		return courseRepository.findAll();
	}

}
