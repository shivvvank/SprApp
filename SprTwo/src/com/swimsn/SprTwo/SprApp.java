package com.swimsn.SprTwo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SprApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach c = context.getBean("CricketCoach",Coach.class);
		
		System.out.println(c.getDailyFortune());
		System.out.println(c.getDailyWorkout());
		context.close();
		
	}

}
