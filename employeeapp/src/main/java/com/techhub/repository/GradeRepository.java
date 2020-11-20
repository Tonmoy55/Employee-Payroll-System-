package com.techhub.repository;

import org.springframework.data.repository.CrudRepository;

import com.techhub.model.Grade;


public interface GradeRepository extends CrudRepository<Grade, Integer> {

}
