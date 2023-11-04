package com.klef.jfsd.sdp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.Faculty;
import com.klef.jfsd.sdp.model.Student;
import com.klef.jfsd.sdp.service.CFSService;
import com.klef.jfsd.sdp.service.FacultyService;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("faculty")
public class FacultyController 
{
	@Autowired
	FacultyService facultyService;
	
	@Autowired
	CFSService cfsService;
	
	@GetMapping("facultyLogin")
	public String facultyLogin()
	{
		
		return "facultyLogin";
	}
	@GetMapping("facultyProfile")
	public ModelAndView facultyProfile(HttpServletRequest request)
	{
		ModelAndView mv=new ModelAndView("facultyProfile");
		HttpSession session=request.getSession();
		Faculty f = (Faculty) session.getAttribute("curFac");
		mv.addObject("faculty",f);
		return mv;
	}
	@GetMapping("facultyHome")
	public ModelAndView facultyHome(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("facultyHome");
		HttpSession session = request.getSession();
		Faculty f = (Faculty) session.getAttribute("curFac");
		
		List<Course> courseList= cfsService.viewCourseByFacultyId(f.getId()) ;
		
		System.out.println("courseList -- -- -- - --- "+ courseList);
		mv.addObject("course_list", courseList);
		mv.addObject("total_courses", courseList.size());
		return mv;
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
			Faculty f=null;
			f = facultyService.checkFacultyUsername(username);
			if(f!=null)
			{
				f=facultyService.facultyLogin(username, password);
				if(f!=null)
				{
					msg="Login Successfully ...";
					mv.setViewName("redirect:/faculty/facultyHome");
					
					HttpSession session = request.getSession();
					session.setAttribute("curFac", f);
					return mv;
				}
				else
				{
					msg= "Login Failed ... Wrong Password... Try Again ";
					mv.setViewName("facultyLogin");
					mv.addObject("message", msg);
				}
			}
			else
			{
				msg="Invalid Credentials";
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
	public ModelAndView updatePassword(HttpServletRequest request)
	{
		String msg=null;
		ModelAndView mv = new ModelAndView();
		
		try 
		{
			;
			String username = request.getParameter("username");
			String secQuestion= request.getParameter("secQuestion");
			String secAnswer= request.getParameter("secAnswer");
			
			Faculty f = facultyService.checkFacultyUsername(username);
			if(f!=null)
			{
				if(f.getSecurityQuestion().equals(secQuestion) && f.getSecAnswer().equals(secAnswer))
				{
					mv.setViewName("facultyResetPassword");
					mv.addObject("message", msg);
				}
				else if(!f.getSecurityQuestion().equals(secAnswer))
				{
					mv.setViewName("facultyForgotPassword");
					msg="Security Question in different.....";
					mv.addObject("message", msg);
				}
				else
				{
					mv.setViewName("facultyForgotPassword");
					msg="Answer is Incorrect";
					mv.addObject("message", msg);
				}
			}
			else
			{
				mv.setViewName("facultyForgotPassword");
				mv.addObject("message",msg);
				
			}
		
			
		} catch (Exception e) 
		{
			msg = e.getMessage();
			mv.setViewName("facultyForgotPassword");
			mv.addObject("message", msg);
		}
		return mv;
	}
	@PutMapping("facultyResetPassword")
	public ModelAndView facultyResetPassword(HttpServletRequest request)
	{
		String msg=null;
		ModelAndView mv = new ModelAndView();
		
		try 
		{
			;
			String username = request.getParameter("newpassword");
			String secQuestion= request.getParameter("secQuestion");
			String secAnswer= request.getParameter("secAnswer");
			
			Faculty f = facultyService.checkFacultyUsername(username);
			
			
		} catch (Exception e) 
		{
			msg = e.getMessage();
			mv.setViewName("facultyForgotPassword");
			mv.addObject("message", msg);
		}
		return mv;
	}

}
