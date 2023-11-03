package com.klef.jfsd.sdp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.sdp.model.CFS_Student;
import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.CourseFacultySection;
import com.klef.jfsd.sdp.model.Student;
@Repository
public interface CFS_StudentRepository extends JpaRepository<CFS_Student, Integer> 
{
	@Query("SELECT COUNT(cfsst) FROM CFS_Student cfsst where cfsst.cfs = ?1 and cfsst.student = ?2")
	  public long checkCfs_StudentMapping(CourseFacultySection cfs,Student student);
	
	@Query("SELECT cfs_student.cfs.course FROM CFS_Student cfs_student where cfs_student.student.id = ?1")
	public List<Course> viewCourseByStudentId(int stid);

}
