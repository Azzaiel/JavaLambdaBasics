package net.virtela.service.impl;

import java.util.ArrayList;
import java.util.List;

import net.virtela.model.Student;

public class SchoolServiceImpl extends Service {

	private List<Student> studentList;

	public SchoolServiceImpl() {
		super();
		this.studentList = new ArrayList<>();
		this.studentList.add(new Student(1L, "Richard Reyles"));
		this.studentList.add(new Student(2L, "Leizza Reyles"));
		this.studentList.add(new Student(3L, "Raicah Reyles"));
		this.studentList.add(new Student(4L, "Adrian Madrelejos"));
		this.studentList.add(new Student(5L, "Krister Mojica"));
		this.studentList.add(new Student(6L, "JB Platon"));
		this.studentList.add(new Student(7L, "Rodel Hidalgo"));
	}

	public Student getStudent(Long id) {
		this.delay(ONE_SECCOND * 2);
		return this.studentList.stream().filter(p -> p.getId().equals(id)).findAny().orElse(null);
	}
	
	public List<Student> getStudentList() {
		this.delay(ONE_SECCOND * 3);
		return this.studentList;
	}

}
