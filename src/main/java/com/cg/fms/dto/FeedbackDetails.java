package com.cg.fms.dto;
//
//import javax.persistence.CascadeType;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//import javax.validation.constraints.NotBlank;
//
//import com.cg.fms.entites.Employee;
//import com.cg.fms.entites.Participant;
//import com.cg.fms.entites.Program;
//
//public class FeedbackDetails {
//	
//	private int feedbackId;
//	private Participant participant;
//	private Program program;
//	private int feedbackCriteria1;
//	private int feedbackCriteria2;
//	private int feedbackCriteria3;
//	private int feedbackCriteria4;
//	private int feedbackCriteria5;
//	private String comments;
//	private String suggestions;
//	public int getFeedbackId() {
//		return feedbackId;
//	}
//	public void setFeedbackId(int feedbackId) {
//		this.feedbackId = feedbackId;
//	}
//	public Participant getParticipant() {
//		return participant;
//	}
//	public void setParticipant(Participant participant) {
//		this.participant = participant;
//	}
//	public Program getProgram() {
//		return program;
//	}
//	public void setProgram(Program program) {
//		this.program = program;
//	}
//	public int getFeedbackCriteria1() {
//		return feedbackCriteria1;
//	}
//	public void setFeedbackCriteria1(int feedbackCriteria1) {
//		this.feedbackCriteria1 = feedbackCriteria1;
//	}
//	public int getFeedbackCriteria2() {
//		return feedbackCriteria2;
//	}
//	public void setFeedbackCriteria2(int feedbackCriteria2) {
//		this.feedbackCriteria2 = feedbackCriteria2;
//	}
//	public int getFeedbackCriteria3() {
//		return feedbackCriteria3;
//	}
//	public void setFeedbackCriteria3(int feedbackCriteria3) {
//		this.feedbackCriteria3 = feedbackCriteria3;
//	}
//	public int getFeedbackCriteria4() {
//		return feedbackCriteria4;
//	}
//	public void setFeedbackCriteria4(int feedbackCriteria4) {
//		this.feedbackCriteria4 = feedbackCriteria4;
//	}
//	public int getFeedbackCriteria5() {
//		return feedbackCriteria5;
//	}
//	public void setFeedbackCriteria5(int feedbackCriteria5) {
//		this.feedbackCriteria5 = feedbackCriteria5;
//	}
//	public String getComments() {
//		return comments;
//	}
//	public void setComments(String comments) {
//		this.comments = comments;
//	}
//	public String getSuggestions() {
//		return suggestions;
//	}
//	public void setSuggestions(String suggestions) {
//		this.suggestions = suggestions;
//	}
//	public FeedbackDetails(int feedbackId, Employee employee, Program program, int feedbackCriteria1,
//			int feedbackCriteria2, int feedbackCriteria3, int feedbackCriteria4, int feedbackCriteria5, String comments,
//			String suggestions) {
//		super();
//		this.feedbackId = feedbackId;
//		this.participant = employee;
//		this.program = program;
//		this.feedbackCriteria1 = feedbackCriteria1;
//		this.feedbackCriteria2 = feedbackCriteria2;
//		this.feedbackCriteria3 = feedbackCriteria3;
//		this.feedbackCriteria4 = feedbackCriteria4;
//		this.feedbackCriteria5 = feedbackCriteria5;
//		this.comments = comments;
//		this.suggestions = suggestions;
//		
//		
//	}
//	public FeedbackDetails(int feedbackId, int feedbackCriteria1, int feedbackCriteria2, int feedbackCriteria3,
//			int feedbackCriteria4, int feedbackCriteria5) {
//		super();
//		this.feedbackId = feedbackId;
//		this.feedbackCriteria1 = feedbackCriteria1;
//		this.feedbackCriteria2 = feedbackCriteria2;
//		this.feedbackCriteria3 = feedbackCriteria3;
//		this.feedbackCriteria4 = feedbackCriteria4;
//		this.feedbackCriteria5 = feedbackCriteria5;
//	}
//	
//	
//

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

import com.cg.fms.entites.Employee;
import com.cg.fms.entites.Program;

public class FeedbackDetails {

	private int feedbackId;
	
	
	private Employee participant;
	
	
	private Program program;
	
	private int feedbackCriteria1;
	
	
	private int feedbackCriteria2;
	
	private int feedbackCriteria3;
	
	private int feedbackCriteria4;
	
	private int feedbackCriteria5;
	private String comments;
	private String suggestions;
	public FeedbackDetails() {
		
	}
	public FeedbackDetails(int feedbackId, Employee participant, Program program, int feedbackCriteria1,
			int feedbackCriteria2, int feedbackCriteria3, int feedbackCriteria4, int feedbackCriteria5, String comments,
			String suggestions) {
		super();
		this.feedbackId = feedbackId;
		this.participant = participant;
		this.program = program;
		this.feedbackCriteria1 = feedbackCriteria1;
		this.feedbackCriteria2 = feedbackCriteria2;
		this.feedbackCriteria3 = feedbackCriteria3;
		this.feedbackCriteria4 = feedbackCriteria4;
		this.feedbackCriteria5 = feedbackCriteria5;
		this.comments = comments;
		this.suggestions = suggestions;
	}
	public int getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}
	public Employee getParticipant() {
		return participant;
	}
	public void setParticipant(Employee participant) {
		this.participant = participant;
	}
	public Program getProgram() {
		return program;
	}
	public void setProgram(Program program) {
		this.program = program;
	}
	public int getFeedbackCriteria1() {
		return feedbackCriteria1;
	}
	public void setFeedbackCriteria1(int feedbackCriteria1) {
		this.feedbackCriteria1 = feedbackCriteria1;
	}
	public int getFeedbackCriteria2() {
		return feedbackCriteria2;
	}
	public void setFeedbackCriteria2(int feedbackCriteria2) {
		this.feedbackCriteria2 = feedbackCriteria2;
	}
	public int getFeedbackCriteria3() {
		return feedbackCriteria3;
	}
	public void setFeedbackCriteria3(int feedbackCriteria3) {
		this.feedbackCriteria3 = feedbackCriteria3;
	}
	public int getFeedbackCriteria4() {
		return feedbackCriteria4;
	}
	public void setFeedbackCriteria4(int feedbackCriteria4) {
		this.feedbackCriteria4 = feedbackCriteria4;
	}
	public int getFeedbackCriteria5() {
		return feedbackCriteria5;
	}
	public void setFeedbackCriteria5(int feedbackCriteria5) {
		this.feedbackCriteria5 = feedbackCriteria5;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getSuggestions() {
		return suggestions;
	}
	public void setSuggestions(String suggestions) {
		this.suggestions = suggestions;
	}
	@Override
	public String toString() {
		return "FeedbackDetails [feedbackId=" + feedbackId + ", participant=" + participant + ", program=" + program
				+ ", feedbackCriteria1=" + feedbackCriteria1 + ", feedbackCriteria2=" + feedbackCriteria2
				+ ", feedbackCriteria3=" + feedbackCriteria3 + ", feedbackCriteria4=" + feedbackCriteria4
				+ ", feedbackCriteria5=" + feedbackCriteria5 + ", comments=" + comments + ", suggestions=" + suggestions
				+ "]";
	}
	
	
}

