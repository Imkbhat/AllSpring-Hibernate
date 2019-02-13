package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] myArray = {"A","B","C","D","E"}; 
	private Random myrandom = new Random();
	
	@Override
	public String getFortune() {
		int index	= myrandom.nextInt(myArray.length);
		return myArray[index];
	}

}
 