package com.klef.jfsd.sdp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.sdp.model.Faculty;
import com.klef.jfsd.sdp.repository.FacultyRepository;

@Service
public class AdminServiceImpl implements AdminService 
{
	
	@Autowired
	FacultyRepository facultyRepository;

	@Override
	public String addFaculty(Faculty f) {
		facultyRepository.save(f);
		return "Faculty Addedd Successfully ...";
	}

}
