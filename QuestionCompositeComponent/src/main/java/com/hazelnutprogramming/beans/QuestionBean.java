package com.hazelnutprogramming.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.hazelnutprogramming.models.Question;

/**
 * 27 Þub 2015
 * @author segeli
 */
@ManagedBean
@ViewScoped
public class QuestionBean {

	private List<Question> questionList;
	List<String> teams;

	public QuestionBean() {
		questionList = new ArrayList<Question>();
		teams = new ArrayList<String>();
	}
	
	@PostConstruct
	public void init(){
		teams.add("BJK");
		teams.add("B. Dortmund");
		teams.add("R. Madrid");
		teams.add("Legia Warszawa");
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(2);
		ints.add(3);
		ints.add(4);
		ints.add(5);
		questionList.add(new Question<String>("What is your name?", "inputText", "", null));
		questionList.add(new Question<String>("What is your favourite football club?", "oneSelectItem", "", teams));
		questionList.add(new Question<Integer>("How many do you have siblings?", "oneSelectItem", "", ints));
	}
	
	public void listAnswer(){
		for (Question question : questionList) {
			System.out.println(question.getAnswer());
		}
	}

	public List<Question> getQuestionList() {
		return questionList;
	}

	public void setQuestionList(List<Question> questionList) {
		this.questionList = questionList;
	}
}
