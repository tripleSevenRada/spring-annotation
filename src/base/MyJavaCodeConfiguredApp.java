package base;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyJavaCodeConfiguredApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		ICoach tennisCoach = context.getBean("thatSillyCoach", ICoach.class);
		System.out.println(tennisCoach.getDailyWorkout());
		ICoach defaultist = context.getBean("defaultComponentNameDemoCoach", ICoach.class);
		System.out.println(defaultist.getDailyWorkout());

		ICoach autoWired = context.getBean("autowiredCoachTellingFortune", ICoach.class);
		System.out.println("AUTOWIRED CONSTRUCTOR INJ : " + autoWired.getDailyWorkout());

		ICoach motorSportCoach = context.getBean("motorSportCoachUsingSetterInj", ICoach.class);
		System.out.println("AUTOWIRED SETTER INJ : " + motorSportCoach.getDailyWorkout());

		ICoach yogaCoach = context.getBean("yogaCoach", ICoach.class);
		System.out.println("AUTOWIRED SETTER INJ : " + yogaCoach.getDailyWorkout());

		for (int i = 0; i < 10; i++) {
			IFortuneCoach fromPropFile = context.getBean("propFilesCoach", IFortuneCoach.class);
			System.out.println("FROM PROP FILE READING randomized coach");
			System.out.println(fromPropFile.getDailyWorkout());
			System.out.println(fromPropFile.getDailyFortune());
		}
		context.close();
	}
}
