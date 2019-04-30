package annotations;

import Interfaces.Coach;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    public String getDailyWorkout() {
        return "Play tennis with me!";
    }

    public String getDailyFortune() {
        return null;
    }
}
