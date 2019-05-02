package annotations;

import Interfaces.Coach;
import Interfaces.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("luckyFortuneService")
    private FortuneService fortuneService;

    public TennisCoach(){
        System.out.println("TennisCoach constructor");
    }

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

    @PostConstruct
    public void postConstr(){
        System.out.println("This is post constructor method");
    }

    @PreDestroy
    public void preDestr(){
        System.out.println("This is pre destroy method");
    }
}
