package annotations;

import Interfaces.Coach;
import Interfaces.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    private FortuneService fortuneService;

    public TennisCoach(){}

    /** Constructor injection */
//    @Autowired
//    public TennisCoach(FortuneService fortuneService){
//        this.fortuneService = fortuneService;
//    }

    /** Setter injection */
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService){
//        this.fortuneService = fortuneService;
//    }

    public String getDailyWorkout() {
        return "Play tennis with me!";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
