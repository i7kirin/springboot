package annotations;

import Interfaces.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class LuckyFortuneService implements FortuneService {
    public String getFortune() {
        return "Lucky day for you!";
    }
}
