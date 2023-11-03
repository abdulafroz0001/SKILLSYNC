package com.klef.jfsd.sdp.service;

import java.util.List;

import com.klef.jfsd.sdp.model.CFS_Student;
import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.CourseFacultySection;
import com.klef.jfsd.sdp.model.Student;

public interface CFS_StudentService 
{
	public String addCFSStudent(CFS_Student cfsst);
	public CFS_Student viewCFSStudentById(int cfsstid);
	public List<CFS_Student>viewAllCFSStudent();
	public long checkCfs_StudentMapping(CourseFacultySection cfs,Student student);
	public List<Course> viewCourseByStudentId(int stid);
}
