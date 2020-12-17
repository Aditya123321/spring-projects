package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach tableTennisCoach = context.getBean("myCoach2", Coach.class);
		
		Coach trackCoach =  context.getBean("trackCoach", Coach.class);
		
		CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);
		
		CricketCoach cricketCoach2 = context.getBean("cricketCoach2", CricketCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println("---------------------------------------");
		System.out.println(tableTennisCoach.getDailyWorkout());
		System.out.println(tableTennisCoach.getDailyFortune());
		System.out.println("---------------------------------------");
		System.out.println(trackCoach.getDailyFortune());
		System.out.println("---------------------------------------");
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());		
		System.out.println(cricketCoach.getEmailAddress());
		System.out.println(cricketCoach.getTeam());
		System.out.println("---------------------------------------");
/*		System.out.println(cricketCoach2.getDailyWorkout());
		System.out.println(cricketCoach2.getDailyFortune());		
		System.out.println(cricketCoach2.getEmailAddress());
		System.out.println(cricketCoach2.getTeam());
		System.out.println("---------------------------------------")*/;
		context.close();
		 

	}

}
