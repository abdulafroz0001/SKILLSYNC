package com.klef.jfsd.sdp.controller;


import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.klef.jfsd.sdp.service.MaterialFileService;


@Controller
@RequestMapping("faculty")
public class FileSystemFacultyController 
{
	@Autowired
	private MaterialFileService materialFileService;

	public ResponseEntity<?> uploadToFIleSystem(String name,String desc,MultipartFile file, int course_id) throws IOException {
		String uploadFile = materialFileService.uploadToFileSystem(name,desc,file,course_id);
		
		return ResponseEntity.status(HttpStatus.OK)
				.body(uploadFile);
	}

	
	@GetMapping("downloadMaterial")
	public ResponseEntity<byte[]> downloadFromFileSystem(@RequestParam("filename") String fileName) throws IOException {
	    byte[] imageData = materialFileService.downloadFromFileSystem(fileName);
	    System.out.println(fileName);
	    System.out.println(imageData);
	    System.out.println(imageData);
	    System.out.println(imageData);
	    System.out.println(imageData);
	    
	   

	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentDispositionFormData("attachment", fileName);
	    
	    MediaType mediaType =null;
	    
//	    if(fileName.endsWith(".pdf"))
//	    {
//	    	mediaType = MediaType.APPLICATION_PDF;
//	    }
//	    else if(fileName.endsWith(".txt"))
//	    {
//	    	mediaType = MediaType.TEXT_PLAIN;
//	    
//	    }
//	    else if(fileName.endsWith(".json"))
//	    {
//	    	mediaType = MediaType.APPLICATION_JSON;
//	    }
//	    else if(fileName.endsWith(".csv"))
//	    {
//	    	mediaType = MediaType.parseMediaType("text/csv");
//	    }
//	    else if(fileName.endsWith(".pptx"))
//	    {
//	    	mediaType = MediaType.parseMediaType("application/vnd.openxmlformats-officedocument.presentationml.presentation");
//	    }
//	    else if(fileName.endsWith(".jpeg"))
//	    {
//	    	mediaType = MediaType.IMAGE_JPEG;
//	    }
//	    else if(fileName.endsWith(".png"))
//	    {
//	    	mediaType = MediaType.IMAGE_PNG;
//	    }
//	    else if(fileName.endsWith(".docx"))
//	    {
//	    	mediaType = MediaType.parseMediaType("application/vnd.openxmlformats-officedocument.wordprocessingml.document");
//	    }
//	    else
//	    {
//	    	mediaType = MediaType.APPLICATION_OCTET_STREAM;
//	    }
	    	
	    
	    headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
	    
	    // Default content type

	    return new ResponseEntity<>(imageData, headers, HttpStatus.OK);
	}


}

