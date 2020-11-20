package com.techhub.idao;

import java.util.List;

import com.techhub.model.Grade;

public interface IGradeSetupDao {

	public void saveGrade(Grade grade);
	
	public List<Grade> findAll();
	
	public void deleteById(int gradeid);
	
	public Grade findById(int gradeid);
}
