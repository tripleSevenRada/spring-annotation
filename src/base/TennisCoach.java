package base;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements ICoach {

	@Override
	public String getDailyWorkout() {
		return "hit the ball 100000 times";
	}

}
