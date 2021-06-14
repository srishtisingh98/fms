package com.cg.fms.service;

import java.util.List;

import com.cg.fms.entites.Course;

public interface ICourseService {

	
	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public Course removeCourse(Course course);

	public Course viewCourse(int course);

	public List<Course> viewAllCourses();
}
