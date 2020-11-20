package com.techhub.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.techhub.iservice.IGradeSetupService;
import com.techhub.model.Grade;


@Controller
public class GradeSetupController {

	@Autowired
	private IGradeSetupService iGradeSetupService;
	
	@RequestMapping("/gradesetup")
	public String gradeSetup(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_GRADESETUP");
		return "gradesetup";
	}
	
	@PostMapping("/savegradesetup")
	public String SaveUser(@ModelAttribute Grade grade,BindingResult BindingResult,HttpServletRequest request) {
		iGradeSetupService.saveGrade(grade);
		request.setAttribute("mode", "MODE_SUCCESS");
		return "gradesetup";
	}
	
	@RequestMapping("/show-all-grade")
	public String ShowAllGrade(HttpServletRequest request) {
		request.setAttribute("grades", iGradeSetupService.showAllGrades());
		request.setAttribute("mode", "SHOW_ALL_GRADES");
		return "gradesetup";
	}
	
	@RequestMapping("/delete-grade")
	public String DeleteGrade(@RequestParam int id,HttpServletRequest request) {
		iGradeSetupService.deleteGrade(id);
		request.setAttribute("grades", iGradeSetupService.showAllGrades());
		request.setAttribute("mode", "SHOW_ALL_GRADES");
		return "gradesetup";
	}
	
	@RequestMapping("/edit-grade")
	public String editGrade(@RequestParam int id,HttpServletRequest request) {
		request.setAttribute("grade", iGradeSetupService.editGrade(id));
		request.setAttribute("mode", "MODE_UPDATE_GRADE");
		return "gradesetup";
	}
	
	@PostMapping("/updategradesetup")
	public String updateUser(@ModelAttribute Grade grade,BindingResult BindingResult,HttpServletRequest request) {
		iGradeSetupService.saveGrade(grade);
		request.setAttribute("mode", "MODE_UPDATE_SUCCESS");
		return "gradesetup";
	}
	
}
