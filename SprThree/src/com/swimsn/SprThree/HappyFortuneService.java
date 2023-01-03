package com.swimsn.SprThree;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Everything's gonna be fine";
	}

}
