package com.cg.fms.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cg.fms.dto.FeedbackDetails;
import com.cg.fms.entites.Employee;
import com.cg.fms.entites.Feedback;
import com.cg.fms.entites.Program;
import com.cg.fms.exception.EmployeeIDNotFoundException;
import com.cg.fms.exception.FeedbackNotFoundException;
import com.cg.fms.exception.ProgramExceptionMessages;
import com.cg.fms.exception.ProgramIDNotFoundException;
import com.cg.fms.exception.TrainerIDNotFoundException;
import com.cg.fms.repository.IFeedbackRepository;
import com.cg.fms.utility.FeedbackUtil;

@Service
@Transactional
public class FeedbackService implements IFeedbackService {

	@Autowired
	private IFeedbackRepository fRepo;

	private Logger logger = LoggerFactory.getLogger(FeedbackService.class);

	@Override
	public Feedback addFeedback(Feedback fd) {

		logger.info("****Adding Feedback" + fd);
		return fRepo.save(fd);
	}

	


//	@Override
//	public List<Feedback> viewTrainerFeedback(int trainerid) {
//
//		Optional<Feedback> opt = fRepo.findById(trainerid);
//		if (!opt.isPresent()) {
//			throw new TrainerIDNotFoundException("Employee with the given ID does not exist");
//		}
//
//		return viewTrainerFeedback(trainerid);
//	}

//	@Override
//	public List<Feedback> viewProgramFeedback(int programId){
//
//		Optional<Feedback> opt = fRepo.findById(programId);
//		if (!opt.isPresent()) {
//			throw new ProgramIDNotFoundException("Program with the given ID does not exist");
//		}
//		return viewProgramFeedback();
//
//	}

//
//	@Override
//	public List<Feedback> viewProgramFeedback(int programId) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
