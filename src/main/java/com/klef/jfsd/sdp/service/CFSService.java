package com.klef.jfsd.sdp.service;

import java.util.List;

import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.CourseFacultySection;
import com.klef.jfsd.sdp.model.Faculty;
import com.klef.jfsd.sdp.model.Section;


public interface CFSService 
{
	public String addCourseFacultySection(CourseFacultySection c);
	public CourseFacultySection viewCourseFacultySectionById(int cfs);
	public List<CourseFacultySection>viewAllCourseFacultySection();
	public long checkCfsMapping(Course course,Faculty faculty,Section section);
	public CourseFacultySection viewCFSByCourseSectionId(int cid, int sid);
	public List<Course> viewCourseByFacultyId(int fid);
}
