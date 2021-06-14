package com.cg.fms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.fms.entites.Employee;

@Repository
public interface ITrainerManagementRepository extends JpaRepository<Employee, Integer> {

}
