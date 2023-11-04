package com.klef.jfsd.sdp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.CourseFacultySection;
import com.klef.jfsd.sdp.model.Faculty;
import com.klef.jfsd.sdp.model.Section;
import com.klef.jfsd.sdp.repository.CFSRepository;

@Service
public class CFSServiceImpl implements CFSService 
{
	@Autowired
	CFSRepository cfsRepository;

	@Override
	public String addCourseFacultySection(CourseFacultySection cfs) {
		cfsRepository.save(cfs);
		return "CFS Added Successfully";
	}

	@Override
	public CourseFacultySection viewCourseFacultySectionById(int cfsid) {
		
		return cfsRepository.findById(cfsid).get();
	}

	@Override
	public List<CourseFacultySection> viewAllCourseFacultySection() {
		
		return (List<CourseFacultySection>)cfsRepository.findAll();
	}

	@Override
	public long checkCfsMapping(Course course, Faculty faculty, Section section) {
		
		return cfsRepository.checkCfsMapping(course, faculty, section);
	}

	@Override
	public CourseFacultySection viewCFSByCourseSectionId(int cid, int sid) {
		
		return cfsRepository.viewCFSByCourseSectionId(cid, sid);
	}

	@Override
	public List<Course> viewCourseByFacultyId(int fid) {
		
		return cfsRepository.viewCourseByFacultyId(fid);
	}
	

}
