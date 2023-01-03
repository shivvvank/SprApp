package com.swimsn.SprOne;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SprApp {

	public static void main(String[] args) {
		
//		var context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		
//		Coach c = context.getBean("Coach2",Coach.class);
//		
//		System.out.println(c.getDailyWorkout());
//		
//		System.out.println(c.getDailyFortune());
//		
//		context.close();
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach c = context.getBean("Coach3",CricketCoach.class);
		
		System.out.println(c.getDailyWorkout());
		System.out.println(c.getDailyFortune());
		System.out.println(c.getEmailAddress());
		System.out.println(c.getTeam());
		context.close();
		
		
	}

}
