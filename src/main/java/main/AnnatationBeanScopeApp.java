package main;

import Interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnatationBeanScopeApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotation-applicationContext.xml");
        Coach coach1 = context.getBean("tennisCoach",Coach.class);

        System.out.println(coach1.getDailyFortune());

        System.out.println(coach1.getDailyWorkout());

        context.close();

    }
}
