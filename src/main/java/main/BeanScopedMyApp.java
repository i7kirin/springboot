package main;

import Interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopedMyApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScoped-applicationContext.xml");

        Coach myCoach = context.getBean("myCoach", Coach.class);

        Coach yourCoach = context.getBean("myCoach", Coach.class);

        System.out.println(myCoach == yourCoach);
        System.out.println("myCoach's hashCode is "+myCoach);
        System.out.println("yourCoach's hashCode is "+yourCoach);
        context.close();
    }
}
