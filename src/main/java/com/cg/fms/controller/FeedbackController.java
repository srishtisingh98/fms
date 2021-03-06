//package com.cg.fms.controller;
//
//import java.util.List;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.cg.fms.dto.FeedbackDetails;
//import com.cg.fms.dto.FeedbackRequest;
//import com.cg.fms.entites.Feedback;
//import com.cg.fms.entites.Program;
//import com.cg.fms.service.IFeedbackService;
//import com.cg.fms.service.IParticipantService;
//import com.cg.fms.service.ITrainerManagementService;
//import com.cg.fms.service.ITrainingProgramService;
//import com.cg.fms.service.TrainerManagementService;
//import com.cg.fms.utility.FeedbackUtil;
//import com.cg.fms.utility.ProgramUtil;
//
//@RestController
//@RequestMapping("/feedback")
//@Validated
//public class FeedbackController {
//
//	@Autowired
//	private IFeedbackService fServ;
//
//	@Autowired
//	private FeedbackUtil fUtil;
//
//	@Autowired
//	private ITrainingProgramService parServ;
//
//	
//	
//	@ResponseStatus(code = HttpStatus.OK)
//	@PostMapping("/add")
//	public FeedbackDetails addFeedback(@RequestBody Feedback feedback) {
//		Feedback rFb = fServ.addFeedback(feedback);
//		return fUtil.toFbDetails(rFb);
//	}
//
//}

package com.cg.fms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cg.fms.dto.EmployeeDetails;
import com.cg.fms.dto.FeedbackDetails;
import com.cg.fms.entites.Employee;
import com.cg.fms.entites.Feedback;
import com.cg.fms.service.IFeedbackService;
import com.cg.fms.utility.FeedbackUtil;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

	@Autowired
	private IFeedbackService feedbackService;

	@Autowired
	private FeedbackUtil fUtil;
	
	
	@ResponseStatus(code = HttpStatus.OK)
	@PostMapping("/add")
	public FeedbackDetails addFeedback(@RequestBody CreateFeedbackRequest feedbackreqdata) {
		System.out.println("requestData: " + feedbackreqdata);
		Feedback feedback = new Feedback();
		System.out.println("fb came: " + feedback);
		Feedback fbk = feedbackService.addFeedback(feedback);
		FeedbackDetails details = fUtil.toDetails(fbk);
		return details;
	}
	
	
	/*@PostMapping(value = "/add/{emploid}")
	public Feedback addFeedback(@RequestBody Feedback feedback, @PathVariable("emploid") Integer id) {
		System.out.println("--------" + feedback + "******" + id);
		return feedbackService.addFeedback(feedback, id);

	}*/
	
}

