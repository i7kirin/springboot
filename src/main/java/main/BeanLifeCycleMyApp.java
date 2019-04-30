package main;

import Interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleMyApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        Coach myCoach = context.getBean("myCoach", Coach.class);

        System.out.println(myCoach.getDailyWorkout());

        context.close();
    }
}
