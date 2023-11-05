package com.klef.jfsd.sdp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.klef.jfsd.sdp.model.Admin;
import com.klef.jfsd.sdp.model.CFS_Student;
import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.CourseFacultySection;
import com.klef.jfsd.sdp.model.Faculty;
import com.klef.jfsd.sdp.model.Section;
import com.klef.jfsd.sdp.model.Student;
import com.klef.jfsd.sdp.service.AdminService;
import com.klef.jfsd.sdp.service.CFSService;
import com.klef.jfsd.sdp.service.CFS_StudentService;
import com.klef.jfsd.sdp.service.CourseService;
import com.klef.jfsd.sdp.service.FacultyService;
import com.klef.jfsd.sdp.service.SectionService;
import com.klef.jfsd.sdp.service.StudentService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("admin")
public class AdminController 
{
	@Autowired
	AdminService adminService;
	
	@Autowired
	CourseService courseService;
	
	@Autowired 
	SectionService sectionService;
	
	@Autowired 
	StudentService studentService;
	
	@Autowired
	CFSService cfsService;
	
	@Autowired
	CFS_StudentService cfs_StudentService;
	
	@Autowired
	FacultyService facultyService;
	
	
	
	
	@GetMapping("adminLogin")
	public String adminLogin()
	{
		return "adminLogin";
	}
	
	public boolean loginStatus(Object user)
	{
		return !(user==null);
	}
	
	@GetMapping("logout")
	public String adminLogout(HttpServletRequest request)
	{
		HttpSession session =  request.getSession();
		session.removeAttribute("curAd");
		
		return "logout";
	}
	
	@PostMapping("checkAdminLogin")
	public ModelAndView checkAdminLogin(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		
		String msg=null;
		
		try {
			
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			Admin a=null;
			a = adminService.checkAdminUsername(username);
			System.out.println(a);
			if(a!=null)
			{
				a=adminService.adminLogin(username, password);
				System.out.println(a);
				if(a!=null)
				{
					msg="Login Successfully ...";
					mv.setViewName("redirect:/admin/adminDashboard");
					
					HttpSession session = request.getSession();
					session.setAttribute("curAd", a);
					return mv;
				}
				else
				{
					msg= "Login Failed ... Wrong Password... Try Again ";
					mv.setViewName("adminLogin");
					mv.addObject("message", msg);
				}
			}
			else
			{
				msg="Invalid Credentials";
				mv.setViewName("adminLogin");
				mv.addObject("message", msg);
				
			}
			
			
		} catch (Exception e) 
		{
			msg= e.getMessage();
			mv.setViewName("adminLogin");
			mv.addObject("message", msg);
			
		}
		return mv;
	}
	
	@GetMapping("adminDashboard")
	public ModelAndView adminDashboard(HttpServletRequest request,HttpServletResponse response)
	{
		 
		if(loginStatus(request.getSession().getAttribute("curAd")))
		{
			response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		    response.setHeader("Pragma", "no-cache");
		    response.setHeader("Expires", "0");
			
			ModelAndView mv = new ModelAndView();
			mv.setViewName("adminDashboard");
			List<Course> courseList = adminService.viewAllCourses();
			List<Faculty> facultyList = adminService.viewAllFaculty();
			List<Student> studentList = adminService.viewAllStudents();
			System.out.println(courseList);
			
			mv.addObject("total_courses", courseList.size());
			mv.addObject("total_faculty", facultyList.size());
			mv.addObject("total_students", studentList.size());
			return mv;
		}
		return new ModelAndView("redirect:/admin/adminLogin");
		
	}
	@GetMapping("viewAllCourses")
	public ModelAndView viewAllCourses()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewAllCourses");
		List<Course> courseList = adminService.viewAllCourses();

//		System.out.println(courseList);
		
		mv.addObject("total_courses", courseList.size());
		mv.addObject("course_list", courseList);

		return mv;
		
	}
	@GetMapping("viewAllFaculty")
	public ModelAndView viewAllFaculty()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewAllFaculty");
		List<Faculty> facultyList = adminService.viewAllFaculty();
		
//		System.out.println(facultyList);
		
		mv.addObject("total_faculty", facultyList.size());
		mv.addObject("faculty_list", facultyList);
		
		return mv;
		
	}
	@GetMapping("viewAllStudents")
	public ModelAndView viewAllStudent()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewAllStudents");
		List<Student> studentList = adminService.viewAllStudents();
		
//		System.out.println(studentList);
		
		mv.addObject("total_students", studentList.size());
		mv.addObject("student_list", studentList);
		
		return mv;
		
	}
	
	@GetMapping("adminHome")
	public ModelAndView adminHome()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("adminHome");
		List<Course> courseList = adminService.viewAllCourses();
		System.out.println(courseList);
		mv.addObject("course_list", courseList);
		mv.addObject("total_courses", courseList.size());
		return mv;
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
	@GetMapping("studentRegister")
	public String studentRegister()
	{
		return "studentRegister";
	}
	@GetMapping("cfsRegister")
	public ModelAndView cfsRegister()
	{
		
		
		ModelAndView mv = new ModelAndView("cfsRegister");
		List<Course> clist= courseService.viewAllCourse();
		List<Section> slist= sectionService.viewAllSection();
		List<Faculty> flist= facultyService.viewAllFaculty();
		
		mv.addObject("coursedata", clist);
		mv.addObject("facultydata", flist);
		mv.addObject("sectiondata", slist);
		return mv;

	}
	
	@GetMapping("cfsStudentRegister")
	public ModelAndView addCfsStudent() throws JsonProcessingException
	{
		ModelAndView mv = new ModelAndView("cfsStudentRegister");
		List<Course> clist= courseService.viewAllCourse();
		List<Section> slist= sectionService.viewAllSection();
		List<Student> stlist= studentService.viewAllStudent();
		List<CourseFacultySection> cfslist = cfsService.viewAllCourseFacultySection();
		mv.addObject("coursedata", clist);
		mv.addObject("studentdata", stlist);
		
		ObjectMapper objectMapper = new ObjectMapper();
		String slistJson = objectMapper.writeValueAsString(slist);
		String cfslistJson = objectMapper.writeValueAsString(cfslist);
	
		mv.addObject("sectiondata", slistJson);
		mv.addObject("cfsdata", cfslistJson);
		return mv;
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
			String secQuestion= request.getParameter("secQuestion");
			String secAnswer= request.getParameter("secAnswer");
			System.out.println(secQuestion+"   ghjkm,");
			System.out.println(secAnswer+"   ghjkm,");
			
			
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
			f.setSecurityQuestion(secQuestion);
			f.setSecAnswer(secAnswer);
			msg= adminService.addFaculty(f);
			mv.setViewName("facultyRegister");
			mv.addObject("message",msg);
			
		} catch (Exception e) 
		{
			msg = e.getMessage();
		}
		return mv;
	}
	
	@PostMapping("insertstudent")
	public ModelAndView insertstudent(HttpServletRequest request)
	{
		String msg=null;
		ModelAndView mv = new ModelAndView();
		
		try 
		{
			String fullname = request.getParameter("fullname");
			String gender= request.getParameter("gender");
			String dob = request.getParameter("dob");
			String dept= request.getParameter("dept");
			String curyear= request.getParameter("cur_year");
			String gpa = request.getParameter("cgpa");
			double cgpa = Double.parseDouble(gpa);
			String email= request.getParameter("email");
			String contactno = request.getParameter("contactno");
			String username = request.getParameter("username");
			String password= request.getParameter("password");
			String secQuestion= request.getParameter("secQuestion");
			String secAnswer= request.getParameter("secAnswer");
			System.out.println(secQuestion+"   ghjkm,");
			System.out.println(secAnswer+"   ghjkm,");
			
			
			Student s= new Student();
			s.setFullname(fullname);
			s.setGender(gender);
			s.setDateofbirth(dob);
			s.setDepartment(dept);
			s.setCurrent_year(curyear);
			s.setEmail(email);
			s.setContactno(contactno);
			s.setCgpa(cgpa);
			s.setUsername(username);
			s.setPassword(password);
			s.setSecurityQuestion(secQuestion);
			s.setSecAnswer(secAnswer);
			msg= adminService.addStudent(s);
			mv.setViewName("studentRegister");
			mv.addObject("message",msg);
			
		} catch (Exception e) 
		{
			msg = e.getMessage();
		}
		return mv;
	}


	@PostMapping("addcourse")
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
			c.setTitle(name);
			c.setCourse_code(course_code);
			c.setDescription(description);
			c.setCredits(credits);
			c.setDepartment(department);
			msg=adminService.addCourse(c);
			mv.setViewName("redirect:/admin/adminHome");
			mv.addObject("message", msg);
		}
		catch(Exception e)
		{
			msg=e.getMessage();
			mv.setViewName("courseRegister");
			mv.addObject("message", msg);
		}
		return mv;
	}
	
	@PostMapping("/insertCfs")
	public ModelAndView insertCfs(HttpServletRequest request)
	{
		int cid = Integer.parseInt(request.getParameter("course"));
		int fid = Integer.parseInt(request.getParameter("faculty"));
		int sid = Integer.parseInt(request.getParameter("section"));
		String st = request.getParameter("is_cc");
		System.out.println(st);
		Course c = courseService.viewCourseById(cid);
		Faculty f = facultyService.viewFacultyById(fid);
		Section s = sectionService.viewSectionById(sid);
		String msg="";
		long check = cfsService.checkCfsMapping(c, f, s);
		if(check>0)
		{
			msg="CFS Failed";
			
		}
		else
		{
			CourseFacultySection cfs = new CourseFacultySection();
			cfs.setCourse(c);
			cfs.setFaculty(f);
			cfs.setSection(s);
			 msg= cfsService.addCourseFacultySection(cfs);
		}
		ModelAndView mv = new ModelAndView("cfsRegister");
		List<Course> clist= courseService.viewAllCourse();
		List<Section> slist= sectionService.viewAllSection();
		List<Faculty> flist= facultyService.viewAllFaculty();
		
		mv.addObject("coursedata", clist);
		mv.addObject("facultydata", flist);
		mv.addObject("sectiondata", slist);
		mv.addObject("message", msg);
		return mv;
	}
	
	@PostMapping("/insertCfsStudent")
	public ModelAndView insertCfsStudent(HttpServletRequest request) throws JsonProcessingException
	{
		ModelAndView mv = new ModelAndView("cfsStudentRegister");
		int stid = Integer.parseInt(request.getParameter("student"));
		int cid = Integer.parseInt(request.getParameter("course"));
		int sid = Integer.parseInt(request.getParameter("section"));
		
		CourseFacultySection cfs = cfsService.viewCFSByCourseSectionId(cid, sid);
		Student s = studentService.viewStudentById(stid);
		String msg = "";
		long check = cfs_StudentService.checkCfs_StudentMapping(cfs, s);
		if(check>0)
		{
			msg="Course Student Mapping Already Exists!";
		}
		else
		{
			
			CFS_Student cfs_Student = new CFS_Student();
			cfs_Student.setCfs(cfs);
			cfs_Student.setStudent(s);
			msg=cfs_StudentService.addCFSStudent(cfs_Student);
		}
		
		List<Course> clist= courseService.viewAllCourse();
		List<Section> slist= sectionService.viewAllSection();
		List<Student> stlist= studentService.viewAllStudent();
		List<CourseFacultySection> cfslist = cfsService.viewAllCourseFacultySection();
		mv.addObject("coursedata", clist);
		mv.addObject("studentdata", stlist);
		
		ObjectMapper objectMapper = new ObjectMapper();
		String slistJson = objectMapper.writeValueAsString(slist);
		String cfslistJson = objectMapper.writeValueAsString(cfslist);
	
		mv.addObject("sectiondata", slistJson);
		mv.addObject("cfsdata", cfslistJson);
		mv.addObject("message", msg);
		return mv;
		

	}
	
}
