package com.cg.fms.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fms.entites.Course;
import com.cg.fms.entites.Feedback;
import com.cg.fms.entites.Program;
import com.cg.fms.exception.ProgramIDNotFoundException;
import com.cg.fms.repository.ITrainingProgramRepository;

@Service
public class TrainingProgramService implements ITrainingProgramService {

	private Logger logger = Logger.getLogger(TrainingProgramService.class);

	@Autowired
	private ITrainingProgramRepository pRepo;

	@Override
	public Program createProgram(Program pr) {
		Optional<Program> progOpt = pRepo.findById(pr.getTrainingId());
		Program returnPrgm = pRepo.save(pr);
		logger.info("Post Created : " + returnPrgm);
		return returnPrgm;
	}

	@Override
	public Program updateProgram(Program pr) {
		Optional<Program> opt = pRepo.findById(pr.getTrainingId());
		if (!opt.isPresent()) {
			throw new ProgramIDNotFoundException("Program ID does not exist");
		}
		Program uPrgm = opt.get();
		uPrgm.setCourse(pr.getCourse());
		uPrgm.setEndDate(pr.getEndDate());
		uPrgm.setStartDate(pr.getStartDate());
		Program updatedPrgm = pRepo.save(uPrgm);
		Optional<Program> prgmOpt = pRepo.findById(pr.getTrainingId());
		pRepo.save(prgmOpt.get());
		logger.info("Program Updated : " + updatedPrgm);
		return updatedPrgm;
	}

	@Override
	public Program removeProgram(int programid) {
		Optional<Program> opt = pRepo.findById(programid);
		if (!opt.isPresent()) {
			throw new ProgramIDNotFoundException("Program ID does not exist");
		}
		pRepo.deleteById(programid);
		logger.info("Logger Deleted : " + opt.get());
		return opt.get();
	}

	@Override
	public Program viewProgram(int programid) {
		
		return viewProgram(programid);
	}

	@Override
	public List<Program> viewAllPrograms() {
		List<Program> prgm = pRepo.findAll();
		return prgm;
	}

	@Override
	public List<Program> viewAllProgramsByDate(LocalDate startdate) {
		List<Program> prgm = pRepo.findAll();
		logger.info("Finding programs by Start Date");
		return prgm.
		stream().
		filter(sdate -> sdate.getStartDate().equals(startdate)).
		collect(Collectors.toList());

	}

	@Override
	public List<Program> viewAllProgramsByFaculty(int facultyid) {
		List<Program> prgm = pRepo.findAll();
		logger.info("getting Programs by faculty");
		return prgm.
		stream().
		filter(faculty -> faculty.getFaculty().equals(facultyid)).
		collect(Collectors.toList());
	}

}
