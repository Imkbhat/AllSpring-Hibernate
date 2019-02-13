package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	
	private FortuneService fortuneService;
	private HelperService helperService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		 fortuneService = theFortuneService;
	}
	
	public BaseballCoach(HelperService theHelper) {
		helperService = theHelper;
	}
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "getDailyWorkout from Baseballcoach";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		//return fortuneService.getDailyFortune();
		return "";
	}

	public HelperService getHelperService() {
		return helperService;
	}

	public void setHelperService(HelperService helperService) {
		this.helperService = helperService;
	}

	@Override
	public String callHelper() {
		return helperService.callHelper();
	}
}
