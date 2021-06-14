package com.cg.fms.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.cg.fms.dto.CourseDetails;
import com.cg.fms.entites.Course;

@Component
public class CourseUtil {


	public CourseDetails ToCourseDetails(Course course) {
		CourseDetails cour = new CourseDetails(course.getCourseId(), course.getCourseName(), course.getCourseDescription(),
				course.getNoOfDays());
		return cour;
	}
//
//	public List<CourseDetails> toDetails(List<Course> courses) {
//		
//		List<CourseDetails> crsDetails = new ArrayList<>();
//		for (Course crs : courses) {
//			crsDetails.add(ToCourseDetails(crs));
//		}
//		return crsDetails;
//	}

	public List<CourseDetails> ToCourseDetailsList(List<Course> viewAllCourses) {
		List<CourseDetails> list = viewAllCourses.stream().map(p -> ToCourseDetails(p)).collect(Collectors.toList());
		return list;
	}

}
