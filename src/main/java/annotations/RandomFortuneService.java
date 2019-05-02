package annotations;

import Interfaces.FortuneService;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] data = {
            "I am learning springboot",
            "I am preparing OCA exam",
            "I want to enter to new Project"
    };

    private Random random = new Random();

    public String getFortune() {
        int index = random.nextInt(data.length);

        return data[index];
    }
}
