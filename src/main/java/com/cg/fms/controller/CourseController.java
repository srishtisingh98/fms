package com.cg.fms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cg.fms.dto.CourseDetails;
import com.cg.fms.dto.CourseRequest;
import com.cg.fms.entites.Course;
import com.cg.fms.service.ICourseService;

import com.cg.fms.utility.CourseUtil;
import com.cg.fms.utility.EmployeeUtil;

@RestController
@RequestMapping("/course")
@Validated
public class CourseController {

	@Autowired
	private ICourseService courseService;

	@Autowired
	private CourseUtil courseUtil;

	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping(value = "/add")
	public CourseDetails addCourse(@RequestBody Course course) {
		Course cReturn = courseService.addCourse(course);
		return courseUtil.ToCourseDetails(cReturn);
	}

	@ResponseStatus(code = HttpStatus.OK)
	@PutMapping("/update")
	public Course updateCourse(@RequestBody Course course) {
		return courseService.updateCourse(course);
	}

	@ResponseStatus(code = HttpStatus.OK)
	@DeleteMapping("/delete/{id}")
	public Course removeCourse(@PathVariable("id") Course course) {
		Course crs = courseService.removeCourse(course);
//		return courseUtil.ToCourseDetails(crs);
		return crs;
	}

	@ResponseStatus(code = HttpStatus.OK)
	@GetMapping("/viewAll")
	public List<Course> viewAllCourses(@RequestBody Course course) {
		return courseService.viewAllCourses();
	}

	@GetMapping("/{id}")
	public Course viewCourse(@PathVariable("id") int courseId) {
	//	return courseUtil.ToCourseDetails(courseService.viewCourse(courseId));
		return courseService.viewCourse(courseId);
	}
}
