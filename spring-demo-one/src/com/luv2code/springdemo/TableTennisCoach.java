package com.luv2code.springdemo;

public class TableTennisCoach implements Coach {
	
	public TableTennisCoach() {
		System.out.println("Table tennis Coach: no arg constructor");
	}
	//define a private field for dependency
	private FortuneService fortuneService;
	
	//define the constructor for dependency injection
	public TableTennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {		
		return  "Practice forehand spin";
	}
	@Override
	public String getDailyFortune() {	
		//use my forunteService to get the fortune
		return fortuneService.getFortune();
	}

}
