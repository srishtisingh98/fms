package com.cg.fms.service;

import javax.validation.Valid;

import com.cg.fms.entites.Employee;

public interface ITrainerManagementService  {

	public Employee addTrainer(Employee emp);

	public Employee getTrainer(int id);

	public Employee deleteTrainer(int id);

	public Employee updateEmployee(@Valid Employee employee);

	public Employee signIn(Employee employee);

	public Employee signOut(Employee employee);

	
	
}