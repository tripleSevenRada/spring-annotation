package base;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("fortuneServiceUsingPropFile")
public class FortuneServiceUsingPropFile implements IFortuneService {

    //@Value("${foo.email}")
    //private String email;
        
    //@Value("${foo.team}")
    //private String team;
	
	//ehmm... https://stackoverflow.com/questions/35798769/how-to-read-all-properties-into-an-array-with-spring
	@Value("#{'${for1}'.split(',')}") 
	List<String> eachLineOfPropertyFile;
	
	private Random myRandom = new Random();
	@Override
	public String getFortune() {
		return eachLineOfPropertyFile.get(myRandom.nextInt(eachLineOfPropertyFile.size()));
	}

}
