package context.config;

import Interfaces.Coach;
import Interfaces.FortuneService;

public class FootballCoach implements Coach {

    private FortuneService fortuneService;
    private String team;
    private String email;

    public FootballCoach() {
        System.out.println("FootballCoach: inside constructor");
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public String getEmail() {
        return email;
    }

    public void setFortuneService(FortuneService fortuneService){
        System.out.println("FootballCoach: inside setter method");
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "I am Football Coach!";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
