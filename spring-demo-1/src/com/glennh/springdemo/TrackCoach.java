package com.glennh.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;

	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: " + this.fortuneService.getFortune();
	}

}
