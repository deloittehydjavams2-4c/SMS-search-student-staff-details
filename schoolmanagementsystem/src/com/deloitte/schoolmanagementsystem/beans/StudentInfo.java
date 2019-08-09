package com.deloitte.schoolmanagementsystem.beans;

import java.util.Date;
import org.springframework.stereotype.Component;

@Component
public class StudentInfo {
   private String student_id;
   private String student_name;
   private Date dob;
   private String guardian_type;
   private String guardian_name;
   private String address;
   private String country_id;
   private long contact_no;
   private String mail_id;
   private String gender;
   private String standard;
   private String standard_category;
   private String transport;
   private double net_fees;
   private CountryInfo countryinfo;
	public CountryInfo getCountryinfo() {
		return countryinfo;
	}
	public void setCountryinfo(CountryInfo countryinfo) {
		this.countryinfo = countryinfo;
	}
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGuardian_type() {
		return guardian_type;
	}
	public void setGuardian_type(String guardian_type) {
		this.guardian_type = guardian_type;
	}
	public String getGuardian_name() {
		return guardian_name;
	}
	public void setGuardian_name(String guardian_name) {
		this.guardian_name = guardian_name;
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
	public long getContact_no() {
		return contact_no;
	}
	public void setContact_no(long contact_no) {
		this.contact_no = contact_no;
	}
	public String getMail_id() {
		return mail_id;
	}
	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getStandard_category() {
		return standard_category;
	}
	public void setStandard_category(String standard_category) {
		this.standard_category = standard_category;
	}
	public String getTransport() {
		return transport;
	}
	public void setTransport(String transport) {
		this.transport = transport;
	}
	public double getNet_fees() {
		return net_fees;
	}
	public void setNet_fees(double net_fees) {
		this.net_fees = net_fees;
	}
	@Override
	public String toString() {
		return "StudentInfo [student_id=" + student_id + ", student_name=" + student_name + ", dob=" + dob
				+ ", guardian_type=" + guardian_type + ", guardian_name=" + guardian_name + ", address=" + address
				+ ", country_id=" + country_id + ", contact_no=" + contact_no + ", mail_id=" + mail_id + ", gender="
				+ gender + ", standard=" + standard + ", standard_category=" + standard_category + ", transport="
				+ transport + ", net_fees=" + net_fees + "]";
	}


}
   

