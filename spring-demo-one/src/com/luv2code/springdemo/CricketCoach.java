package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Spring has converted emailAddress  to setEmailAddress()");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Spring container has converted team to setTeam()");
		this.team = team;
	}

	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("Inside no-arg Constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter method-setFortuneService()");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice Batting for 2 hours a day";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

	@Override
	public String callHelper() {
		// TODO Auto-generated method stub
		return "If any help please call Helper";
	}
	
	public void doMyStartUpStuff() {
		System.out.println("Inside CricketCoach domyStartUpStuff()");
	}
	
	public void doMyCleanUpStuff() {
		System.out.println("Inside CricketCoach domyCleanUpStuff()");
	}
}
