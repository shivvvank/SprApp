package com.swimsn.SprThree;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SprThreeApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach coachObj = context.getBean("cricketCoach",Coach.class);
		System.out.println(coachObj.getDailyWorkout());
		System.out.println(coachObj.getDailyFortune());
		context.close();
	}

}
