package com.glennh.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BakingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice kneading";
	}

}
