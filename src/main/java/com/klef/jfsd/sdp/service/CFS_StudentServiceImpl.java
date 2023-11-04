package com.klef.jfsd.sdp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.sdp.model.CFS_Student;
import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.CourseFacultySection;
import com.klef.jfsd.sdp.model.Student;
import com.klef.jfsd.sdp.repository.CFS_StudentRepository;
@Service
public class CFS_StudentServiceImpl implements CFS_StudentService {

	@Autowired
	CFS_StudentRepository cfs_StudentRepository;

	@Override
	public String addCFSStudent(CFS_Student cfs) {
		cfs_StudentRepository.save(cfs);
		return "CFS Added Successfully";
	}

	@Override
	public CFS_Student viewCFSStudentById(int cfsid) {
		
		return cfs_StudentRepository.findById(cfsid).get();
	}

	@Override
	public List<CFS_Student> viewAllCFSStudent() {
		
		return (List<CFS_Student>)cfs_StudentRepository.findAll();
	}

	@Override
	public long checkCfs_StudentMapping(CourseFacultySection cfs, Student student) {
		
		return cfs_StudentRepository.checkCfs_StudentMapping(cfs, student);
	}

	@Override
	public List<Course> viewCourseByStudentId(int stid) {
		
		return cfs_StudentRepository.viewCourseByStudentId(stid);
	}

	
	

}
