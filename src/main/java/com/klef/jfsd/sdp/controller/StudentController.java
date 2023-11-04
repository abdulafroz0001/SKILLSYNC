package com.klef.jfsd.sdp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.Faculty;
import com.klef.jfsd.sdp.model.Student;
import com.klef.jfsd.sdp.service.CFS_StudentService;
import com.klef.jfsd.sdp.service.StudentService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("student")
public class StudentController
{
	@Autowired
	StudentService studentService;
	
	@Autowired
	CFS_StudentService cfs_StudentService;
	@GetMapping("studentLogin")
	public String studentLogin()
	{
		return "studentLogin";
	}
	@GetMapping("studentProfile")
	public ModelAndView studentProfile(HttpServletRequest request)
	{
		ModelAndView mv=new ModelAndView("studentprofile");
		HttpSession session=request.getSession();
		Student s = (Student) session.getAttribute("curStu");
		mv.addObject("student",s);
		return mv;
	}
	@GetMapping("studentHome")
	public ModelAndView studentHome(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("studentHome");
		HttpSession session = request.getSession();
		Student s = (Student) session.getAttribute("curStu");
		
		List<Course> courseList= cfs_StudentService.viewCourseByStudentId(s.getId()) ;
		
		System.out.println("courseList -- -- -- - --- "+ courseList);
		mv.addObject("course_list", courseList);
		mv.addObject("total_courses", courseList.size());
		return mv;
	}
	
	@GetMapping("studentCoursePage")
	public String studentCoursePage()
	{
		return "studentCoursePage";
	}
	
	
	@PostMapping("checkStudentLogin")
	public ModelAndView checkStudentLogin(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		
		String msg=null;
		
		try {
			
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			Student s=null;
			s = studentService.checkStudentUsername(username);
			if(s!=null)
			{
				s=studentService.studentLogin(username, password);
				if(s!=null)
				{
					msg="Login Successfully ...";
					mv.setViewName("redirect:/student/studentHome");
					
					HttpSession session = request.getSession();
					session.setAttribute("curStu", s);
					return mv;
				}
				else
				{
					msg= "Login Failed ... Wrong Password... Try Again ";
					mv.setViewName("studentLogin");
					mv.addObject("message", msg);
				}
			}
			else
			{
				msg="Invalid Credentials";
				mv.setViewName("studentLogin");
				mv.addObject("message", msg);
				
			}
			
			
		} catch (Exception e) 
		{
			msg= e.getMessage();
			mv.setViewName("studentLogin");
			mv.addObject("message", msg);
			
		}
		return mv;
	}
}
