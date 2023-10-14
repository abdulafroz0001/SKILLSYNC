package com.klef.jfsd.sdp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.sdp.model.Faculty;
import com.klef.jfsd.sdp.repository.FacultyRepository;

@Service
public class FacultyServiceImpl implements FacultyService 
{
	@Autowired
	FacultyRepository facultyRepository;

	@Override
	public Faculty facultyLogin(String fusername, String fpassword) {
		
		return facultyRepository.facultyLogin(fusername, fpassword);
	}

}
