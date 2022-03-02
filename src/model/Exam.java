package model;

import java.util.Date;

public class Exam {

	private String courseName;
	private Date examDate;
	private String teacherName;
	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Date getExamDate() {
		return examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public Exam(){}
	
	public Exam(String cn, String tn, Date d){
		this.courseName = cn;
		this.teacherName = tn;
		this.examDate = d;
	}
	
	public String toString() {
		return courseName + " tenuto da " + teacherName
				+ " il " + examDate;
	}
	
	
}

