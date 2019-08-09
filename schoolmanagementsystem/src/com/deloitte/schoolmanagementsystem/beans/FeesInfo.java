package com.deloitte.schoolmanagementsystem.beans;
import org.springframework.stereotype.Component;

@Component
public class FeesInfo {
	private String standard;
	private int age;
	private double stdfees;
	private double transportfee;
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getStdfees() {
		return stdfees;
	}
	public void setStdfees(double stdfees) {
		this.stdfees = stdfees;
	}
	public double getTransportfee() {
		return transportfee;
	}
	public void setTransportfee(double transportfee) {
		this.transportfee = transportfee;
	}
	

}
