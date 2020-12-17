package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	
	public static void main(String[] args) {
	
	//load the configuration file
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
	
	// get the bean from spring container
	Coach theCoach = context.getBean("myCoach", Coach.class);
	Coach alphaCoach = context.getBean("myCoach", Coach.class);
	
	//check if they are the same beans
	boolean result = (theCoach==alphaCoach);
	System.out.println("Same::??"+result);
	
	//printout memory location
	System.out.println("the coach::"+theCoach);
	System.out.println("alpha coach::"+alphaCoach);
	
	System.out.println(theCoach.getDailyFortune());
	System.out.println(theCoach.getDailyWorkout());
	System.out.println("---------------------");
	System.out.println(alphaCoach.getDailyFortune());
	System.out.println(alphaCoach.getDailyWorkout());
	
	//close the container
	context.close();
	}

}
