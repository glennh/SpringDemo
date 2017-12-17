package com.glennh.springdemo;

import java.util.Random;

public class ArrayFortuneService implements FortuneService {
	public String getFortune() {
		String[] fortunes = new String[3];
		fortunes[0] = "Catch rain drops";
		fortunes[1] = "Eat mice";
		fortunes[2] = "Run away";
		Random random = new Random();
		return fortunes[random.nextInt(3)];
	}
}
