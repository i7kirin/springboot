package noxml;

import Interfaces.Coach;
import Interfaces.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    FortuneService fortuneService;

    public String getDailyWorkout() {
        return "Run 5km hard";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
