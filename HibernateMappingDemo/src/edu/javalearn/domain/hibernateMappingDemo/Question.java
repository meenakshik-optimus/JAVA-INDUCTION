package edu.javalearn.domain.hibernateMappingDemo;

import java.util.List;

public class Question {
	private int id;
	private String questionName;
	private List<Answer> answers;

	/**
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return
	 */
	public String getQuestionName() {
		return questionName;
	}

	/**
	 * @param questionName
	 */
	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	/**
	 * @return
	 */
	public List<Answer> getAnswers() {
		return answers;
	}

	/**
	 * @param answers
	 */
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

}
