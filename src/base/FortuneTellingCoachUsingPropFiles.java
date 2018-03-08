package base;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("propFilesCoach")
@Scope("singleton")
public class FortuneTellingCoachUsingPropFiles implements IFortuneCoach {

	public FortuneTellingCoachUsingPropFiles(){
		System.out.println("inside constructor FortuneTellingCoachUsingPropFiles");
	}
	@Autowired
	@Qualifier("fortuneServiceUsingPropFile")
	IFortuneService randomFromPropFiles;
	@Override
	public String getDailyWorkout() {
		return "read prop file again again";
	}
	@Value("#{'${for1}'.split(',')}")
	List<String> availableFortunes;
	@PostConstruct
	public void doMyStartUp(){
		System.out.println("startUp " + this.hashCode());
		System.out.println("availableFortunes");
		for(String value : availableFortunes)System.out.println(value);
	}
	@PreDestroy
	public void doMyCleanUp(){
		System.out.println("cleanUp " + this.hashCode());
	}
	
	@Override
	public String getDailyFortune() {
		return randomFromPropFiles.getFortune();
	}

}
