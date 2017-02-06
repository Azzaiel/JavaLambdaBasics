package net.virtela.model;

public class Grade {

	private Long gradeId;
	private String name;

	public Grade() {
		super();
	}

	public Grade(Long gradeId, String name) {
		super();
		this.gradeId = gradeId;
		this.name = name;
	}

	public Long getGradeId() {
		return gradeId;
	}

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
