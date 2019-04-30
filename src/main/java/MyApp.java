import Interfaces.Coach;
import context.config.FootballCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);
        FootballCoach footballCoach = context.getBean("myFootballCoach", FootballCoach.class);
        System.out.println(footballCoach.getDailyWorkout());
        System.out.println(footballCoach.getDailyFortune());
        System.out.println(footballCoach.getTeam());
        System.out.println(footballCoach.getEmail());
        context.close();
    }
}
