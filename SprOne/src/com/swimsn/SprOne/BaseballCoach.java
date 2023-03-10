package com.swimsn.SprOne;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService)
	{
		this.fortuneService=fortuneService;
	}
	public String getDailyWorkout()
	{
		return "Spend 30 mins in batting";
	}
	public String getDailyFortune()
	{
		return fortuneService.getDailyFortune();
	}
}
