package com.klef.jfsd.sdp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("student")
public class StudentController
{
	@GetMapping("studentLogin")
	public String studentLogin()
	{
		return "studentLogin";
	}
	
	@GetMapping("studentHome")
	public String studentHome()
	{
		return "studentHome";
	}
	
	@GetMapping("studentCoursePage")
	public String studentCoursePage()
	{
		return "studentCoursePage";
	}
}
