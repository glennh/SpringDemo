package com.glennh.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;

	
	@Override
	public String getDailyWorkout() {
		return "Practice lob";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	@PostConstruct
	public void setup() {
		System.out.println("in setup");
	}

	@PreDestroy
	public void cleanup() {
		System.out.println("in cleanup");
	}
}
