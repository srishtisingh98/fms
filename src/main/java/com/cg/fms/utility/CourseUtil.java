package com.cg.fms.utility;

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

}
