package base;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aplicationContext.xml"); 
	
        ICoach tennisCoach = context.getBean("thatSillyCoach",ICoach.class);
        System.out.println(tennisCoach.getDailyWorkout());
        ICoach defaultist = context.getBean("defaultComponentNameDemoCoach", ICoach.class);
        System.out.println(defaultist.getDailyWorkout());
        
        ICoach autoWired = context.getBean("autowiredCoachTellingFortune",ICoach.class);
        System.out.println("AUTOWIRED CONSTRUCTOR INJ : " + autoWired.getDailyWorkout());
        
        ICoach motorSportCoach = context.getBean("motorSportCoachUsingSetterInj",ICoach.class);
        System.out.println("AUTOWIRED SETTER INJ : " + motorSportCoach.getDailyWorkout());
        
        ICoach yogaCoach = context.getBean("yogaCoach",ICoach.class);
        System.out.println("AUTOWIRED SETTER INJ : " + yogaCoach.getDailyWorkout());
        
        context.close();
        
	}

}
