package context.config;

import Interfaces.Coach;
import Interfaces.FortuneService;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "I am Track Coach!";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void doMyStartupStuff(){
        System.out.println("TrackCoach: inside doMyStartupStuff");
    }

    public void doMyCleanupStuff(){
        System.out.println("TrackCoach: inside doMyCleanupStuff");
    }
}
