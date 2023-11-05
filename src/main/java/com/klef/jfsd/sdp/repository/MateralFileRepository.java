package com.klef.jfsd.sdp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.sdp.model.MaterialFile;

@Repository
public interface MateralFileRepository extends JpaRepository<MaterialFile, Integer>{
	
	public MaterialFile findByName(String fileName);
	@Query("select f from MaterialFile f where course_id=?1")
	public List<MaterialFile> viewFilesByCourseId(int cid);

}
