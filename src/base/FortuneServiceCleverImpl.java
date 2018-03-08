package base;

import org.springframework.stereotype.Component;

@Component("cleverFortunetelling")
public class FortuneServiceCleverImpl implements IFortuneService {

	@Override
	public String getFortune() {
		return "some clever fortunetelling";
	}

}
