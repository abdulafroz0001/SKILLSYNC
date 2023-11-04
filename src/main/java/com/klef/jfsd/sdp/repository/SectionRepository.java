package com.klef.jfsd.sdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.sdp.model.Section;

@Repository
public interface SectionRepository extends JpaRepository<Section, Integer> 
{
	

}
