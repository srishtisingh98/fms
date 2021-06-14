//package com.cg.fms.utility;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.springframework.stereotype.Component;
//
//import com.cg.fms.dto.FeedbackDetails;
//import com.cg.fms.dto.ProgramDetails;
//import com.cg.fms.entites.Feedback;
//
//@Component
//public class FeedbackUtil {
//
//	public FeedbackDetails toFbDetails(Feedback rFb) {
//
//		FeedbackDetails fbDetails = new FeedbackDetails(rFb.getFeedbackId(), rFb.getParticipant(), rFb.getProgram(),
//				rFb.getFeedbackCriteria1(), rFb.getFeedbackCriteria2(), rFb.getFeedbackCriteria3(),
//				rFb.getFeedbackCriteria4(), rFb.getFeedbackCriteria5(), rFb.getComments(), rFb.getSuggestions());
//
//		return fbDetails;
//	}
//
//
//}

package com.cg.fms.utility;

import org.springframework.stereotype.Component;

import com.cg.fms.dto.EmployeeDetails;
import com.cg.fms.dto.FeedbackDetails;
import com.cg.fms.entites.Employee;
import com.cg.fms.entites.Feedback;

@Component
public class FeedbackUtil {
	
	public FeedbackDetails toDetails(Feedback fb) {

		FeedbackDetails fbDetails = new FeedbackDetails(fb.getFeedbackId(),fb.getParticipant(),fb.getProgram(),
				fb.getFeedbackCriteria1(),fb.getFeedbackCriteria2(),fb.getFeedbackCriteria3(),fb.getFeedbackCriteria4(),
				fb.getFeedbackCriteria5(),fb.getComments(),fb.getSuggestions());

return fbDetails;
}

}

