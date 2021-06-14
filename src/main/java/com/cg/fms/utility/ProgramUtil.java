package com.cg.fms.utility;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cg.fms.dto.ProgramDetails;
import com.cg.fms.entites.Program;

@Component
public class ProgramUtil {

	public ProgramDetails toProgram(Program prog) {
		ProgramDetails pDet = new ProgramDetails(prog.getTrainingId(), prog.getStartDate(), prog.getEndDate(), prog.getCourse(), prog.getFaculty());
		return pDet;
	}

	public ProgramDetails programToProgramDetails(Program pUpd) {
		ProgramDetails pDets = new ProgramDetails(pUpd.getEndDate(),pUpd.getStartDate(), pUpd.getCourse(), pUpd.getFaculty());
				return pDets;
	}

//	public ProgramDetails toProgram(Program prog) {
//
//		ProgramDetails pDto = new ProgramDetails(prog.getTrainingId(), prog.getStartDate(), prog.getEndDate(),
//				cServ.findById(prog.getCourse().getCourseId()),
//				eServ.findById(prog.getFaculty().getEmployeeId));
//		return pDto;
//
//	}
//
//	public List<ProgramDetails> toProgramDetailsList(Program prog) {
//	List<ProgramDetails> pViewAll = new ProgramDetails(prog.getTrainingId(), prog.getStartDate(), prog.getEndDate());
//		return pViewAll;
//	}

	// public Program progReqToProgram(Program program) {
		
	

}
