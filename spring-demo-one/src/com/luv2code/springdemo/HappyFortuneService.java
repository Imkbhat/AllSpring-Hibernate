package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Get daily fortune/Have a good Day";
	}
}
