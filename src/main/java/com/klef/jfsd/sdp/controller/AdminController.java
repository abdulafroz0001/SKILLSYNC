package com.klef.jfsd.sdp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.Faculty;
import com.klef.jfsd.sdp.service.AdminService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("admin")
public class AdminController 
{
	@Autowired
	AdminService adminService;
	
	@GetMapping("adminLogin")
	public String adminLogin()
	{
		return "adminLogin";
	}
	
	@GetMapping("adminHome")
	public String adminHome()
	{
		return "adminHome";
	}
	
	@GetMapping("adminCoursePage")
	public String adminCoursePage()
	{
		return "adminCoursePage";
	}
	
	@GetMapping("facultyRegister")
	public String facultyRegister()
	{
		return "facultyRegister";
	}
	@GetMapping("courseRegister")
	public String courseRegister()
	{
		return "courseRegister";
	}
	
	@PostMapping("insertfaculty")
	public ModelAndView insertfaculty(HttpServletRequest request)
	{
		String msg=null;
		ModelAndView mv = new ModelAndView();
		
		try 
		{
			String fullname = request.getParameter("fullname");
			String gender= request.getParameter("gender");
			String dob = request.getParameter("dob");
			String dept= request.getParameter("dept");
			String course= request.getParameter("course");
			String sal = request.getParameter("salary");
			double salary = Double.parseDouble(sal);
			String email= request.getParameter("email");
			String contactno = request.getParameter("contactno");
			String username = request.getParameter("username");
			String password= request.getParameter("password");
			
			Faculty f= new Faculty();
			f.setFullname(fullname);
			f.setGender(gender);
			f.setDateofbirth(dob);
			f.setDepartment(dept);
			f.setCourse(course);
			f.setEmail(email);
			f.setContactno(contactno);
			f.setSalary(salary);
			f.setUsername(username);
			f.setPassword(password);
			
			msg= adminService.addFaculty(f);
			mv.setViewName("facultyRegister");
			mv.addObject("message",msg);
			
		} catch (Exception e) 
		{
			msg = e.getMessage();
		}
		return mv;
	}


	@GetMapping("addcourse")
	public ModelAndView addcourse(HttpServletRequest request)
	{
		String msg=null;
		ModelAndView mv = new ModelAndView();
		try
		{
			String name=request.getParameter("name");
			String course_code=request.getParameter("course_code");
			String description=request.getParameter("description");
			String cred=request.getParameter("credits");
			int credits=Integer.parseInt(cred);
			String department=request.getParameter("department");
			
			Course c=new Course();
			c.setName(name);
			c.setCourse_code(course_code);
			c.setDescription(description);
			c.setCredits(credits);
			c.setDepartment(department);
		}
		catch(Exception e)
		{
			msg=e.getMessage();
		}
		return mv;
	}
}
