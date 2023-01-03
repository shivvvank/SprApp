package com.swimsn.SprOne;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService)
	{
		this.fortuneService=fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Run 3 miles in morning";
	}
	@Override 
	public String getDailyFortune()
	{
		return fortuneService.getDailyFortune();
	}

}
