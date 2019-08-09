package com.deloitte.schoolmanagementsystem.beans;
import org.springframework.stereotype.Component;

@Component
public class StudentMarkSecondary {
      private String studentid;
      private int english_mark;
      private int hindi_mark;
      private int science_mark;
      private int social_mark;
      private int maths_mark;
      private int total_mark;
      private double average_mark;
      private String grade;
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public int getEnglish_mark() {
		return english_mark;
	}
	public void setEnglish_mark(int english_mark) {
		this.english_mark = english_mark;
	}
	public int getHindi_mark() {
		return hindi_mark;
	}
	public void setHindi_mark(int hindi_mark) {
		this.hindi_mark = hindi_mark;
	}
	public int getScience_mark() {
		return science_mark;
	}
	public void setScience_mark(int science_mark) {
		this.science_mark = science_mark;
	}
	public int getSocial_mark() {
		return social_mark;
	}
	public void setSocial_mark(int social_mark) {
		this.social_mark = social_mark;
	}
	public int getMaths_mark() {
		return maths_mark;
	}
	public void setMaths_mark(int maths_mark) {
		this.maths_mark = maths_mark;
	}
	public int getTotal_mark() {
		return total_mark;
	}
	public void setTotal_mark(int total_mark) {
		this.total_mark = total_mark;
	}
	public double getAverage_mark() {
		return average_mark;
	}
	public void setAverage_mark(double average_mark) {
		this.average_mark = average_mark;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
      
}
