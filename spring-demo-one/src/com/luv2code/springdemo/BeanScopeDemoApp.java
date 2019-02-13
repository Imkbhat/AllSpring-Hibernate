package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =
				new  ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach theCoach  = context.getBean("myCricketCoach", Coach.class);
		
		Coach theOtherCoach  = context.getBean("myCricketCoach", Coach.class);
		
		boolean result = (theCoach == theOtherCoach);
		
		System.out.println(result);
		
		System.out.println("Location of theCoach :"+theCoach);
		
		System.out.println("Location of theOtherCoach :"+theOtherCoach);
		
		
		context.close();
	}

}
