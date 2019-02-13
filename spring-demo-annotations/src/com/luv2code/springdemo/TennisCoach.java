package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	/*@Autowired
	public TennisCoach(FortuneService service) {
		this.fortuneService = service;
	}*/
	
	@Override
	public String getDailyWorkout() {
		return "getDailyWOrkout for 15 minutes from tennis coach";
	}

	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	/*@Autowired
	public void callMyMethod(FortuneService service)  {
		this.fortuneService = service;
	}*/

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//Post Construct method
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println("Do my start up stuff");
	}
	
	//pre destroy method
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println("Do my clean up Stuff");
	}

}
