package com.cg.main;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.bean.AssessmentBean;

public class AssignmentMain {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		AssessmentBean assessmentBean=new AssessmentBean();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		System.out.println("Enter Trainee name");
		String name=assessmentBean.setTraineeName(scanner.nextLine());
		System.out.println("Enter Module Name");
		String module=assessmentBean.setModuleName(scanner.nextLine());
		System.out.println("Enter MPT Score");
		int mpt=assessmentBean.setMptScore(scanner.nextInt());
		System.out.println("Enter MTT Score");
		int MTT=assessmentBean.setMptScore(scanner.nextInt());
		System.out.println("Enter AssignMent Marks");
		int assign=assessmentBean.setAssignmentMarks(scanner.nextInt());
		System.out.println("Total Marks");
		
		
		int total=(assessmentBean.getMptScore()+assessmentBean.getMttScore()+assessmentBean.getAssignmentMarks())/100;
		System.out.println(total);
		
		em.persist(assessmentBean);
		em.getTransaction().commit();
		em.close();
		factory.close();
		
	}
}
