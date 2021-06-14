package com.cg.fms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.fms.entites.Course;

@Repository
public interface ICourseRepo extends JpaRepository<Course, Integer> {

}
