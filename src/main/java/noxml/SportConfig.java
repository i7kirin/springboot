package noxml;

import Interfaces.Coach;
import Interfaces.FortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("./")
@PropertySource("classpath:swim.properties")
public class SportConfig {

    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    @Bean
    public Coach swimCoach(FortuneService fortuneService){
        return new SwimCoach(sadFortuneService());
    }
}
