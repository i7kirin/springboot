package annotations;

import Interfaces.Coach;

public class TennisCoach implements Coach {
    public String getDailyWorkout() {
        return "Play tennis with me!";
    }

    public String getDailyFortune() {
        return null;
    }
}
