package com.glennh.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Sadness";
	}

}
