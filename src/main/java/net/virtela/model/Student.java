package net.virtela.model;

public class Student {

	private Long id;
	private String nane;

	public Student() {
		super();
	}

	public Student(Long id, String nane) {
		super();
		this.id = id;
		this.nane = nane;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNane() {
		return nane;
	}

	public void setNane(String nane) {
		this.nane = nane;
	}

}
