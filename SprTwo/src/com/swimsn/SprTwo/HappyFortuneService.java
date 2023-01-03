package com.swimsn.SprTwo;

import org.springframework.stereotype.Component;

@Component("Fortune1")
public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Everything's gonna be fine";
	}

}
