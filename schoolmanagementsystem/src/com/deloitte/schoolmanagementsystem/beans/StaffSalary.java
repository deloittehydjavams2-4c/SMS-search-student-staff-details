package com.deloitte.schoolmanagementsystem.beans;
import org.springframework.stereotype.Component;

@Component
public class StaffSalary {

	 private int year_of_experience;
	 private String highest_qualification;
	 private double salary;
	public int getYear_of_experience() {
		return year_of_experience;
	}
	public void setYear_of_experience(int year_of_experience) {
		this.year_of_experience = year_of_experience;
	}
	public String getHighest_qualification() {
		return highest_qualification;
	}
	public void setHighest_qualification(String highest_qualification) {
		this.highest_qualification = highest_qualification;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	 
}
