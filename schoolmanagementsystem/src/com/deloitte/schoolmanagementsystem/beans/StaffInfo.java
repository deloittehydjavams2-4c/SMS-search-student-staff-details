package com.deloitte.schoolmanagementsystem.beans;

import java.util.Date;
import org.springframework.stereotype.Component;

@Component
public class StaffInfo {
       private String staff_id;
       private String staff_name;
       private Date date_of_birth;
       private String address;
       private String country_id;
       private String gender;
       private double salary;
       private String highest_qualification;
       private String email_id;
       private long contact_number;
       private String designation;
       private int year_passed_out;
       private int experience;
       private Date doj;
       private CountryInfo countryinfo;
   	public CountryInfo getCountryinfo() {
   		return countryinfo;
   	}
   	public void setCountryinfo(CountryInfo countryinfo) {
   		this.countryinfo = countryinfo;
   	}
	public String getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(String staff_id) {
		this.staff_id = staff_id;
	}
	public String getStaff_name() {
		return staff_name;
	}
	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}
	public Date getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry_id() {
		return country_id;
	}
	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getHighest_qualification() {
		return highest_qualification;
	}
	public void setHighest_qualification(String highest_qualification) {
		this.highest_qualification = highest_qualification;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public long getContact_number() {
		return contact_number;
	}
	public void setContact_number(long contact_number) {
		this.contact_number = contact_number;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getYear_passed_out() {
		return year_passed_out;
	}
	public void setYear_passed_out(int year_passed_out) {
		this.year_passed_out = year_passed_out;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
       
}
