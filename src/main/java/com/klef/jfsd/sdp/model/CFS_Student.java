package com.klef.jfsd.sdp.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "cfs_student")
public class CFS_Student
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cfs_id")
	CourseFacultySection cfs;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id")
	Student student;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CourseFacultySection getCfs() {
		return cfs;
	}

	public void setCfs(CourseFacultySection cfs) {
		this.cfs = cfs;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "CFSStudent [id=" + id + ", cfs=" + cfs + ", student=" + student + "]";
	}

}
