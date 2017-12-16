package com.glennh.springdemo;

public class SailingCoach implements Coach {
	private FortuneService fortuneService;

	public SailingCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice roll tacks";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
}
