package com.deloitte.schoolmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.deloitte.schoolmanagementsystem.beans.StudentInfo;
import com.deloitte.schoolmanagementsystem.beans.CountryInfo;
import com.deloitte.schoolmanagementsystem.beans.StaffInfo;
import com.deloitte.schoolmanagementsystem.dao.SearchDAO;


@Controller
public class SmsController {
	@Autowired
	SearchDAO searchdao;
	
	@RequestMapping(value="search", method=RequestMethod.GET)
	public String search(){
		return "Search";
	}
	@RequestMapping(value="search", method=RequestMethod.POST)
	public ModelAndView query(@RequestParam("Category") String Category,@RequestParam("SearchBy") String SearchBy,@RequestParam("Values") String Values){
		System.out.println(Category + " "+ SearchBy +" " +Values);
		ModelAndView mav =  new ModelAndView();
		if(Category.equals("Student")){
			List<StudentInfo> stdlist = searchdao.StudentInfo(Values);
			for(StudentInfo stdinfo : stdlist){
				//System.out.println(stdinfo.getCountry_id());
				CountryInfo country_info = searchdao.CountryInfo(stdinfo.getCountry_id());
				stdinfo.setCountryinfo(country_info);
			}
			mav.addObject("list", stdlist);
			mav.setViewName("StudentDetails");
		}else{
			List<StaffInfo> stflist = searchdao.StaffInfo(SearchBy,Values);
			for(StaffInfo stfinfo : stflist){
				//System.out.println(stdinfo.getCountry_id());
				CountryInfo country_info = searchdao.CountryInfo(stfinfo.getCountry_id());
				stfinfo.setCountryinfo(country_info);
			}
			mav.addObject("list1", stflist);
			mav.setViewName("StaffDetails");
		}
		return mav;
	}
}
