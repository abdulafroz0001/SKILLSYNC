package com.klef.jfsd.sdp.service;

import java.util.List;

import com.klef.jfsd.sdp.model.Faculty;

public interface FacultyService 
{
	public Faculty facultyLogin(String fusername,String fpassword);
	public Faculty checkFacultyUsername(String fusername);
	public List<Faculty>viewAllFaculty();
	public Faculty viewFacultyById(int fid);
	

}
