package com.coursehandler.Course.controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.coursehandler.Course.Entities.Courses;
import com.coursehandler.Course.services.CourseService;

@RestController
public class MyController {
	@Autowired
	private CourseService cs;
	@GetMapping("/home")
	public String getHome() {
		return"WelCome to The Page";
	}
	// Get Courses
	
	@GetMapping("/Courses")
	public List<Courses> getCourses(){
		return cs.getCourses();
	}
}
