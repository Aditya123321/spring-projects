package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private FortuneService fortuneService2;	
	
	public FortuneService getFortuneService2() {
		return fortuneService2;
	}

	public void setFortuneService2(FortuneService sportFortuneService2) {
		this.fortuneService2 = sportFortuneService2;
	}

	//defining new fields
	private String emailAddress;
	private String team;
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket coach:: inside setter method for emailaddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("Cricket coach:: inside setter method for team");
		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public CricketCoach() {
		System.out.println("Cricket Coach: no arg constructor");
	}

	@Override
	public String getDailyWorkout() {
		
		return "practice straight drive";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService2.getFortune();
	}

}
