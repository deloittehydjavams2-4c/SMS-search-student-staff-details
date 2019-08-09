package com.deloitte.schoolmanagementsystem.dao;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.deloitte.schoolmanagementsystem.beans.*;
import com.deloitte.schoolmanagementsystem.beans.CountryInfo;


@Repository
public class SearchDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<StudentInfo> StudentInfo(String Values){
		String qry ="select student_id,student_name,dob,gender,standard,guardian_name,address,country_id,contact_no,mail_id,transport,net_fees from student_info where standard = '" + Values + "'";
		List<StudentInfo> stdlist = jdbcTemplate.query(qry, new BeanPropertyRowMapper<StudentInfo>(StudentInfo.class));
		return stdlist;
	} 
	public CountryInfo CountryInfo(String country_id){
		String qry ="select country_name,state_name from country_info where country_id = '"+country_id+"'";
		List<CountryInfo> clist = jdbcTemplate.query(qry, new BeanPropertyRowMapper<CountryInfo>(CountryInfo.class));
		return clist.get(0);
	} 
	
	public List<StaffInfo> StaffInfo(String searchby, String Values){
		String qry;
		if(searchby.equals("Salary")){
			qry ="select * from staff_info where "+searchby+"= " + Values + "";
		}else{
			qry ="select * from staff_info where "+searchby+"= '" + Values + "'";
		}
		List<StaffInfo> stflist = jdbcTemplate.query(qry, new BeanPropertyRowMapper<StaffInfo>(StaffInfo.class));
		return stflist;
	} 
	
}
