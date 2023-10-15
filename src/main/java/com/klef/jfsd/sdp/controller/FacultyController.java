package com.klef.jfsd.sdp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.sdp.model.Faculty;
import com.klef.jfsd.sdp.service.FacultyService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("faculty")
public class FacultyController 
{
	@Autowired
	FacultyService facultyService;
	
	
	@GetMapping("facultyLogin")
	public String facultyLogin()
	{
		return "facultyLogin";
	}
	
	@GetMapping("facultyHome")
	public String facultyHome()
	{
		return "facultyHome";
	}
	
	@GetMapping("facultyCoursePage")
	public String facultyCoursePage()
	{
		return "facultyCoursePage";
	}
	
	@PostMapping("checkFacultyLogin")
	public ModelAndView checkFacultyLogin(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		
		String msg=null;
		
		try {
			
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			Faculty f = facultyService.facultyLogin(username, password);
			if(f!=null)
			{
				msg="Login Successfully ...";
				mv.setViewName("facultyHome");
				mv.addObject("message", msg);
			}
			else
			{
				msg= "Login Failed ... ";
				mv.setViewName("facultyLogin");
				mv.addObject("message", msg);
			}
			
			
		} catch (Exception e) 
		{
			msg= e.getMessage();
			mv.setViewName("facultyLogin");
			mv.addObject("message", msg);
			
		}
		return mv;
	}
	
	@GetMapping("facultyForgotPassword")
	public String facultyForgotPassword()
	{
		return "facultyForgotPassword";
	}
	@PostMapping("updatePassword")
	public String updatePassword()
	{
		return null;
	}

}
