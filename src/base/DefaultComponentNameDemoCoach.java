package base;

import org.springframework.stereotype.Component;

@Component
public class DefaultComponentNameDemoCoach implements ICoach {

	@Override
	public String getDailyWorkout() {
		return "me is just default name coach i dunno";
	}

}
