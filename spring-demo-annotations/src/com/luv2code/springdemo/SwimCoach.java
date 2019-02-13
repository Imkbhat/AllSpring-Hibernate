package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	
	
	
	public SwimCoach(FortuneService  service) {
		this.fortuneService = service;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice 1000m daily.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
