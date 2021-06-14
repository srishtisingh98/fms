package com.cg.fms.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fms.entites.Course;
import com.cg.fms.entites.Employee;
import com.cg.fms.exception.CourseIdNotFoundException;
import com.cg.fms.exception.EmployeeIDNotFoundException;
import com.cg.fms.exception.ICourseRepository;
import com.cg.fms.repository.ICourseRepo;

@Service
@Transactional
public class CourseService implements ICourseService {

	private Logger logger = LoggerFactory.getLogger(CourseService.class);

	@Autowired
	private ICourseRepo cRepo;

	@Override
	public Course addCourse(Course course) {
		System.out.println(course);
		Course crs = cRepo.save(course);
		logger.info("Course Added: " + crs);
		return crs;

	}

	@Override
	public Course updateCourse(Course course) {
		logger.info("*** udating : " + course);
		Course emp = cRepo.save(course);
		return emp;
	}

	@Override
	public Course removeCourse(Course course) {
		logger.info("***Removing Course by Id: " + course + "***");
		Optional<Course> opt = cRepo.findById(course.getCourseId());
		if (!opt.isPresent()) {
			throw new CourseIdNotFoundException("Course not found for id: " + course.getCourseId());
		}
		Course crs = opt.get();
		cRepo.delete(crs);
		return crs;
	}

	@Override
	public Course viewCourse(int course) {
		Optional<Course> opt = cRepo.findById(course);
		if (!opt.isPresent()) {
			throw new CourseIdNotFoundException("Course not found for id: " + course);
		}
		Course crs = opt.get();
		return crs;
	}


	@Override
	public List<Course> viewAllCourses() {
		return cRepo.findAll();
	}

}
