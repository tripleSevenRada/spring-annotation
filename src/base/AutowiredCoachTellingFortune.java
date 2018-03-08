package base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AutowiredCoachTellingFortune implements ICoach{

	IFortuneService myService;
	
	//constructor DI
	//@Autowired(required = false)
	@Autowired
	public AutowiredCoachTellingFortune(@Qualifier("cleverFortunetelling") IFortuneService myService){
		this.myService = myService;
		//maybe we want sillyFortunetelling impl
	}
	
	@Override
	public String getDailyWorkout() {
		return "dailyWorkout plus fortune: " + myService.getFortune();
	}

}
