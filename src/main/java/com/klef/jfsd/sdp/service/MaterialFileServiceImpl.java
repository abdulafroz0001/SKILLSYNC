package com.klef.jfsd.sdp.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.klef.jfsd.sdp.model.MaterialFile;
import com.klef.jfsd.sdp.repository.MateralFileRepository;

@Service
public class MaterialFileServiceImpl implements MaterialFileService 
{
	@Autowired
	MateralFileRepository fileRepository;
	
	private final String FOLDER_PATH="C:/Users/ABDUL AFROZ/Downloads/uploads/";

	@Override
	public String uploadToFileSystem(String name,String desc,MultipartFile file,int course_id) 
	{
		String filePath=FOLDER_PATH+file.getOriginalFilename();
        System.out.println(filePath);

        MaterialFile fileData=fileRepository.save(MaterialFile.builder()
                .name(file.getOriginalFilename())
                .type(file.getContentType())
                .filePath(filePath)
                .description(desc)
                .course_id(course_id).build());

        try {
			file.transferTo(new File(filePath));
		} catch (IllegalStateException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

        if (fileData != null) {
            return "file uploaded successfully : " + filePath;
        }
        return null;
	}

	@Override
	public byte[] downloadFromFileSystem(String filename) {
		 MaterialFile fileData = fileRepository.findByName(filename);
	     String filePath=fileData.getFilePath();
	        byte[] images = null;
			try {
				images = Files.readAllBytes(new File(filePath).toPath());
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	        return images;

	}

	@Override
	public List<MaterialFile> viewFilesByCourseId(int cid) {
		
		return fileRepository.viewFilesByCourseId(cid);
	}

}
