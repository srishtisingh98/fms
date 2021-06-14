package com.cg.fms.dto;

import java.time.LocalDate;
import java.util.List;

import com.cg.fms.entites.Course;
import com.cg.fms.entites.Employee;

public class ProgramDetails {
	
	private int trainingId;
	private LocalDate startDate;
	private LocalDate endDate;
	private List <Course> course;
	private Employee faculty;
	public int getTrainingId() {
		return trainingId;
	}
	public void setTrainingId(int trainingId) {
		this.trainingId = trainingId;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public List <Course> getCourse() {
		return course;
	}
	public void setCourse(List <Course> course) {
		this.course = course;
	}
	public Employee getFaculty() {
		return faculty;
	}
	public void setFaculty(Employee faculty) {
		this.faculty = faculty;
	}
	
	public ProgramDetails(int trainingId, LocalDate startDate, LocalDate endDate, List <Course> course, Employee faculty) {
		super();
		this.trainingId = trainingId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.course = course;
		this.faculty = faculty;
	}
	public ProgramDetails(LocalDate startDate, LocalDate endDate, List <Course> course, Employee faculty) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.course = course;
		this.faculty = faculty;
	}
	
	
	
	
	
	

}
