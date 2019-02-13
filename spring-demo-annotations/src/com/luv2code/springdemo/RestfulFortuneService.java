package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RestfulFortuneService implements FortuneService {

	@Override
	public String getFortune() {

		return "Restful";
	}

}
