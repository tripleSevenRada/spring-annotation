package base;

import org.springframework.stereotype.Component;

@Component("sillyFortunetelling")
public class FortuneServiceSillyImpl implements IFortuneService {

	@Override
	public String getFortune() {
		return "some silly fortunetelling";
	}

}
