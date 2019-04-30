package context.config;

import Interfaces.Coach;
import Interfaces.FortuneService;

public class BaseballCoach implements Coach {
    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getDailyWorkout(){
        return "I am Baseball Coach!";
    }
}
