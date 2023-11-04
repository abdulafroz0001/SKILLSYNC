package com.klef.jfsd.sdp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.CourseFacultySection;
import com.klef.jfsd.sdp.model.Faculty;
import com.klef.jfsd.sdp.model.Section;

@Repository
public interface CFSRepository extends CrudRepository<CourseFacultySection, Integer> 
{
	@Query("SELECT COUNT(cfs) FROM CourseFacultySection cfs where cfs.course = ?1 and cfs.faculty = ?2 and cfs.section = ?3")
	  public long checkCfsMapping(Course course,Faculty faculty,Section section);
	
	@Query("SELECT cfs FROM CourseFacultySection cfs where cfs.course.id = ?1 and cfs.section.id = ?2")
	  public CourseFacultySection viewCFSByCourseSectionId(int cid, int sid);
	
	@Query("SELECT cfs.course FROM CourseFacultySection cfs where cfs.faculty.id = ?1")
	public List<Course> viewCourseByFacultyId(int fid);
}
