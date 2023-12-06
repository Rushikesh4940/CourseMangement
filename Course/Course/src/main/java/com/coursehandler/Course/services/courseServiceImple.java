package com.coursehandler.Course.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.coursehandler.Course.Entities.Courses;
@Service
public class courseServiceImple implements CourseService {
	List<Courses>ls;
	public courseServiceImple() {
		ls= new ArrayList<>();
		ls.add(new Courses(1,"Java","Rishi",2000));
		ls.add(new Courses(1,"Spring","Rishi",5000));
	}
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return null;
	}

}
