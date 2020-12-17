package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	public FortuneService fortuneService;
	
	public TrackCoach() {
		System.out.println("Track Coach: no arg constructor");
	}
 	public TrackCoach(FortuneService myFortuneService) {
		fortuneService = myFortuneService;
	}
	@Override
	public String getDailyWorkout() {

		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return "Today I will run more because i am fortunate";
	}

}
