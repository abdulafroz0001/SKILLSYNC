package com.klef.jfsd.sdp.service;

import java.util.List;

import com.klef.jfsd.sdp.model.Section;

public interface SectionService 
{
	public String addSection(Section c);
	public Section viewSectionById(int sid);
	public List<Section>viewAllSection();

}
