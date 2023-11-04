package com.klef.jfsd.sdp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService
{
	@Autowired
	CourseRepository courseRepository;

	@Override
	public String addCourse(Course c) {
		courseRepository.save(c);
		return "Course Saved Succesfully";
	}

	@Override
	public Course viewCourseById(int cid) {
		
		return courseRepository.findById(cid).get();
	}

	@Override
	public List<Course> viewAllCourse() {
		
		return courseRepository.findAll();
	}

}
