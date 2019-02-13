package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	
	private FortuneService fortunService;
	
	public TrackCoach(FortuneService fortunService) {
		this.fortunService = fortunService;
	}

	@Override
	public String getDailyWorkout() {
		return "getDailyWorkout from TrackCoach";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String callHelper() {
		// TODO Auto-generated method stub
		return fortunService.getDailyFortune();
	}
	
	

}
