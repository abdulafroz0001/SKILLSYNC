package com.klef.jfsd.sdp.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.klef.jfsd.sdp.model.MaterialFile;


public interface MaterialFileService 
{
	public String uploadToFileSystem(String name,String desc,MultipartFile file,int course_id);
	public byte[] downloadFromFileSystem(String filname);
	public List<MaterialFile> viewFilesByCourseId(int cid);

}
