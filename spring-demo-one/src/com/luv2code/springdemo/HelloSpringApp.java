package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		//Load Spring Container+jm 
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Create Context 
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		
		//Call Appropriate Method
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.callHelper());
		
		//Close Context
		context.close();
	}

}
