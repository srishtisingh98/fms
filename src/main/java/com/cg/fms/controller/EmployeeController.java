package com.cg.fms.controller;

import javax.validation.Valid;

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

import com.cg.fms.dto.CreateTrainerRequest;
import com.cg.fms.dto.EmployeeDetails;
import com.cg.fms.entites.Employee;
import com.cg.fms.service.ITrainerManagementService;
import com.cg.fms.utility.EmployeeUtil;

@RestController
@RequestMapping("/Employee")
@Validated
public class EmployeeController {

	@Autowired
	private ITrainerManagementService eServ;
//
//	@Autowired
//	private EmployeeUtil eUtil;

	@Autowired
	private ITrainerManagementService employeeService;

	@Autowired
	private EmployeeUtil employeeUtil;

	@PostMapping("/signin")
	public Employee signIn(@RequestBody Employee employee) {
		Employee rEmp = eServ.signIn(employee);
		if (!(rEmp.getPassword().equals(employee.getPassword()))) {
			// throw new WrongCredentialsException("Wrong Password");
		}
		return rEmp;
	}

	@GetMapping("/signout")
	public Employee signOut(@RequestBody Employee employee) {
		System.out.println("Request Data : " + employee);
		Employee rEmp = eServ.signOut(employee);
		return rEmp;
	}

//	@ResponseStatus(code = HttpStatus.CREATED)
//	@PostMapping("/add/trainer")
//	public Employee addTrainer(@RequestBody Employee trainer) {
//		Employee rEmp = eServ.addTrainer(trainer);
//		return rEmp;
//	
//	@ResponseStatus(code = HttpStatus.CREATED)
//	@PostMapping(value = "/add")
//	public EmployeeDetails addTrainer(@RequestBody EmployeeRequest employeeDetails) {
//		Employee employee = new Employee(employeeDetails.getEmpName(), employeeDetails.getPassword(), employeeDetails.getRole());
//		Employee emp = employeeService.register(employee);
//		return EmployeeUtil.toDetails(emp);
//	
	


	@PostMapping(value = "/add")
	public EmployeeDetails addTrainer(@RequestBody CreateTrainerRequest requestData) {
		System.out.println("requestData: " + requestData);
		Employee employee = new Employee(requestData.getEmpName(),requestData.getPassword(),requestData.getRole());
//		Employee employee = new Employee(requestData.getEmpName(),requestData.getPassword());
		System.out.println("emp came: " + employee);
		Employee emp = employeeService.addTrainer(employee);
		EmployeeDetails details = employeeUtil.toDetails(emp);
		return details;
	}

	@GetMapping(value = "/get/{id}")
	public Employee getTrainer(@PathVariable("id") int id) {
		return employeeService.getTrainer(id);
	}

	@DeleteMapping(value = "/delete/{id}")
	public Employee deleteTrainer(@PathVariable("id") int id) {
		return employeeService.deleteTrainer(id);
	}

	@PutMapping(value = "/update")
	public Employee updateTrainer(@RequestBody @Valid Employee employee) {
		return employeeService.updateEmployee(employee);
	}

}
