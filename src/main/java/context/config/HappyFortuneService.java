package context.config;

import Interfaces.FortuneService;

public class HappyFortuneService implements FortuneService {
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
