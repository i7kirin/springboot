package noxml;

import Interfaces.FortuneService;

public class SadFortuneService implements FortuneService {

    public String getFortune() {
        return "Today is a sad day";
    }

}
