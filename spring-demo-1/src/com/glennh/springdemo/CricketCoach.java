package com.glennh.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice batting";
	}
	
	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
	
	@Override
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}



}
