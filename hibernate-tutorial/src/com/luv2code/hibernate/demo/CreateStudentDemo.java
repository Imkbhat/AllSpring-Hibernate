package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			Student stu = new Student("Anusha", "Bhat", "kbs71190@gmail.com");
			
			session.beginTransaction();
			
			int theId = (Integer)session.save(stu);
			
			session.getTransaction().commit();
			
		 } finally {
			session.close();
		  }
		}
}
