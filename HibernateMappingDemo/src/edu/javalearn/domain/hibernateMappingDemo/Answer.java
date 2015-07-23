package edu.javalearn.domain.hibernateMappingDemo;

public class Answer {

	private int id;
	private String answerName;
	private String postedBy;

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
	public String getAnswerName() {
		return answerName;
	}

	/**
	 * @param answerName
	 */
	public void setAnswerName(String answerName) {
		this.answerName = answerName;
	}

	/**
	 * @return
	 */
	public String getPostedBy() {
		return postedBy;
	}

	/**
	 * @param postedBy
	 */
	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}

}
