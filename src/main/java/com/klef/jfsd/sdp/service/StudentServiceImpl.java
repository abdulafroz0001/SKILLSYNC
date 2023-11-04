package com.klef.jfsd.sdp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.sdp.model.Student;
import com.klef.jfsd.sdp.repository.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;

	@Override
	public String addStudent(Student st) 
	{
		
		studentRepository.save(st);
		return "Student added Successfully";
	}

	@Override
	public Student viewStudentById(int stid) {
		
		return studentRepository.findById(stid).get();
	}

	@Override
	public List<Student> viewAllStudent() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student studentLogin(String susername, String spassword) {
		
		return studentRepository.studentLogin(susername, spassword);
	}

	@Override
	public Student checkStudentUsername(String susername) {
		
		return studentRepository.checkStudentUsername(susername);
	}

}
