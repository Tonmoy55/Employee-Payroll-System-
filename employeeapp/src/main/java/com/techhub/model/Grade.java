package com.techhub.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="grade")
public class Grade {

	@Id
	private int id;
	private String gradename;
	
	
	
	public Grade() {
	}



	public Grade(String gradename) {
		super();
		this.gradename = gradename;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getGradename() {
		return gradename;
	}



	public void setGradename(String gradename) {
		this.gradename = gradename;
	}



	@Override
	public String toString() {
		return "Grade [id=" + id + ", gradename=" + gradename + "]";
	}


}
