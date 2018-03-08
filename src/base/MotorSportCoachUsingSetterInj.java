package base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MotorSportCoachUsingSetterInj implements ICoach {

	private IFortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "drive like a madman, maybe you are lucky... " + fortuneService.getFortune();
	}
 
	@Autowired
	public void setFortuneService(@Qualifier("cleverFortunetelling") IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

}
