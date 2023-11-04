package com.klef.jfsd.sdp.service;

import java.util.List;

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

	@Override
	public Faculty checkFacultyUsername(String fusername) {
		
		return facultyRepository.checkFacultyUsername(fusername);
	}

	@Override
	public List<Faculty> viewAllFaculty() {
		
		return facultyRepository.findAll();
	}

	@Override
	public Faculty viewFacultyById(int fid) {
		// TODO Auto-generated method stub
		return facultyRepository.findById(fid).get();
	}

}
