package noxml;

import Interfaces.Coach;
import Interfaces.FortuneService;
import org.springframework.beans.factory.annotation.Value;


public class SwimCoach implements Coach {

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Swim 2km as a warm up. " + team;
    }

    public String getDailyFortune() {
        return fortuneService.getFortune() + " " + email;
    }
}
