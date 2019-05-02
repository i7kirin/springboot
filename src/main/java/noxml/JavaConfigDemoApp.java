package noxml;

import Interfaces.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

//        Coach hockeyCoach = context.getBean("hockeyCoach", Coach.class);
//
//        System.out.println(hockeyCoach.getDailyWorkout());
//
//        System.out.println(hockeyCoach.getDailyFortune());

        context.close();
    }
}
