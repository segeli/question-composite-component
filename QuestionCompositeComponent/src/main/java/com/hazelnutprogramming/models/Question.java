package com.hazelnutprogramming.models;

import java.util.List;

/**
 * 27 Þub 2015
 * 
 * @author segeli
 */

public class Question<T> {

	private String question;
	private String type;
	private String answer;
	private List<T> options;
	
	public Question() {
	}

	public Question(String question, String type, String answer,
			List<T> options) {
		super();
		this.question = question;
		this.type = type;
		this.answer = answer;
		this.options = options;
	}



	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public List<T> getOptions() {
		return options;
	}

	public void setOptions(List<T> options) {
		this.options = options;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
