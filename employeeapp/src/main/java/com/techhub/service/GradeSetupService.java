package com.techhub.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.techhub.idao.IGradeSetupDao;
import com.techhub.iservice.IGradeSetupService;
import com.techhub.model.Grade;


@Service
public class GradeSetupService implements IGradeSetupService {

	@Autowired
	private IGradeSetupDao iGradeSetupServiceDao;
	
	
	@Override
	public void saveGrade(Grade grade) {

		iGradeSetupServiceDao.saveGrade(grade);

	}

	@Override
	public List<Grade> showAllGrades() {
		 
		List<Grade> grade =	iGradeSetupServiceDao.findAll();
		
		return grade;
	}

	@Override
	public void deleteGrade(int gradeid) {
		
		iGradeSetupServiceDao.deleteById(gradeid);
	}

	@Override
	public Grade editGrade(int gradeid) {
		return iGradeSetupServiceDao.findById(gradeid);
	}
}
