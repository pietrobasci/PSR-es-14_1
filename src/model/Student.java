package model;

import java.util.ArrayList;
import java.util.List;

public class Student extends User{

	private List<Exam> exams=new ArrayList<Exam>();

	public List<Exam> getExams() {
		return exams;
	}

	public void setExams(Exam exam) {
		this.exams.add(exam);
	}
	
}
