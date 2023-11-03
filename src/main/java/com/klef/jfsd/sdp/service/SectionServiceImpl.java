package com.klef.jfsd.sdp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.sdp.model.Section;
import com.klef.jfsd.sdp.repository.SectionRepository;

@Service
public class SectionServiceImpl implements SectionService{

	@Autowired
	SectionRepository sectionRepository;
	
	@Override
	public String addSection(Section s) {
		sectionRepository.save(s);
		return "Section added Succesfully";
	}

	@Override
	public Section viewSectionById(int sid) {
		
		return sectionRepository.findById(sid).get();
	}

	@Override
	public List<Section> viewAllSection() {
		
		return sectionRepository.findAll();
	}

}
