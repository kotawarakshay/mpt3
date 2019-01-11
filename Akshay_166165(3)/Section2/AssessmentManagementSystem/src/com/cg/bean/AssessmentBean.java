package com.cg.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Trainee_details")
public class AssessmentBean implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String traineeName;
	private String moduleName;
	private int mptScore;
	private int mttScore;
	private int assignmentMarks;
	private int total;
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public String setTraineeName(String traineeName) {
		return this.traineeName = traineeName;
	}
	public String getModuleName() {
		return moduleName;
	}
	public String setModuleName(String moduleName) {
		return this.moduleName = moduleName;
	}
	public int getMptScore() {
		return mptScore;
	}
	public int setMptScore(int mptScore) {
		return this.mptScore = mptScore;
	}
	public int getMttScore() {
		return mttScore;
	}
	public void setMttScore(int mttScore) {
		this.mttScore = mttScore;
	}
	public int getAssignmentMarks() {
		return assignmentMarks;
	}
	public int setAssignmentMarks(int assignmentMarks) {
		return this.assignmentMarks = assignmentMarks;
	}
	
	
	
	

}
