package com.techhub.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
import org.springframework.stereotype.Component;
import com.techhub.idao.IGradeSetupDao;
import com.techhub.model.Grade;
import com.techhub.repository.GradeRepository;

@Component
@Transactional
public class GradeSetupDao implements IGradeSetupDao {

	private final GradeRepository gradeRepository;

	public GradeSetupDao(GradeRepository gradeRepository) {

		this.gradeRepository = gradeRepository;
	}

	@Override
	public void saveGrade(Grade grade) {
		gradeRepository.save(grade);

	}

	@Override
	public List<Grade> findAll() {
		List<Grade> grades = new ArrayList<Grade>();

		for (Grade grade : gradeRepository.findAll()) {
			grades.add(grade);
		}
		return grades;
	}

	@Override
	public void deleteById(int gradeid) {
		gradeRepository.deleteById(gradeid);

	}

	@Override
	public Grade findById(int gradeid) {
		return gradeRepository.findById(gradeid).orElse(null);
	}

}
