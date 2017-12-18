package base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("yogaCoach")
public class SetterInjectedYogaCoach implements ICoach {

	private IFortuneService fortune;
	
	@Autowired
	@Qualifier("cleverFortunetelling")
	private IFortuneService fieldInjected;

	@Override
	public String getDailyWorkout() {
		return "your SetterInjectedYogaCoach: just breath, your fortune: " +
				fortune.getFortune() + " | your fild injected fortune: " + fieldInjected.getFortune();
	}

	/**
	 * @return the fortune
	 */
	public IFortuneService getFortune() {
		return fortune;
	}

	/**
	 * @param fortune the fortune to set
	 * we can put autowired on any method
	 */
	@Autowired
	public void setFortune(@Qualifier("sillyFortunetelling") IFortuneService fortune) {
		this.fortune = fortune;
	}

}
