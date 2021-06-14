package com.cg.fms.dto;

import java.util.HashMap;
import java.util.Map;

import com.cg.fms.entites.Feedback;
import com.cg.fms.entites.Participant;
import com.cg.fms.entites.Program;

public class FeedbackRequest {
	
	private Participant participant;
	private Program program;
	private int feedbackCriteria1;
	private int feedbackCriteria2;
	private int feedbackCriteria3;
	private int feedbackCriteria4;
	private int feedbackCriteria5;
	private String comments;
	private String suggestions;
//	private Map<Long, Feedback> chosenAnswers = new HashMap<>();
	
	
	public Participant getParticipant() {
		return participant;
	}
	public void setParticipant(Participant participant) {
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
	public FeedbackRequest(Participant participant, Program program, int feedbackCriteria1, int feedbackCriteria2,
			int feedbackCriteria3, int feedbackCriteria4, int feedbackCriteria5, String comments, String suggestions) {
		super();
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
//	public int getChosenAnswers(int answers) {
//		return answers;
//	}
//	
//	public void setChosenAnswers(Map<Long, Feedback> answers) {
//		this.chosenAnswers = answers;
//	}
	
	

}
