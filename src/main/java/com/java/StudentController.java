package com.java;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.dao.StudentRepository;
import com.java.dto.Student;

@Controller
public class StudentController {

	@Autowired
	StudentRepository rep;

	/*@RequestMapping(path="/addStudent.do", method=RequestMethod.POST)*/
	@PostMapping("/addStudent.do")
	public ModelAndView addStudent(ModelAndView mv, HttpServletRequest request) {
		Student st = new Student();
		st.setName(request.getParameter("name"));
		st.setAddress(request.getParameter("address"));
		st.setPhNo(Long.parseLong(request.getParameter("phNo")));
		rep.addStudent(st);
		mv.addObject("message", "Student added successfully with id" + st.getId());
		mv.setViewName("success");
		return mv;
	}

	@RequestMapping(path="/getStudent.do", method=RequestMethod.GET)
/*	@GetMapping("/getStudent.do")*/
	public ModelAndView getStudents(ModelAndView mv) {
		mv.addObject("students", rep.getStudents());
		mv.setViewName("displayStudents");
		return mv;
	}
}
