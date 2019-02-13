package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	
	//define bean for fortune service
	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}

	//define bean for swim coach and pass dependency
	@Bean
	public Coach swimCoach(FortuneService service) {
		SwimCoach coach = new SwimCoach(happyFortuneService());
		return coach;
	}

}
