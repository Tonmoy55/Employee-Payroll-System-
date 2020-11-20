package com.techhub.iservice;

import java.util.List;

import com.techhub.model.Grade;

public interface IGradeSetupService {
	
	public void saveGrade(Grade grade);
	
	public List<Grade> showAllGrades();
	
	public void deleteGrade(int gradeid);
	
	public Grade editGrade(int gradeid);
}
