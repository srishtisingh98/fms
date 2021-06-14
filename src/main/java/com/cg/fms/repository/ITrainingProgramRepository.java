package com.cg.fms.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.fms.entites.Program;

@Repository
public interface ITrainingProgramRepository extends JpaRepository<Program, Integer> {

}
