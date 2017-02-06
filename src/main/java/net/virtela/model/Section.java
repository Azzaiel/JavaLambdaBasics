package net.virtela.model;

public class Section {

	private long sectionId;
	private String name;

	public Section() {
		super();
	}

	public Section(long sectionId, String name) {
		super();
		this.sectionId = sectionId;
		this.name = name;
	}

	public long getSectionId() {
		return sectionId;
	}

	public void setSectionId(long sectionId) {
		this.sectionId = sectionId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
