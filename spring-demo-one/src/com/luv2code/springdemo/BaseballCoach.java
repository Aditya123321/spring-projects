package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	public BaseballCoach() {
		System.out.println("Baseball Coach: no arg constructor");
	}
	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
}
