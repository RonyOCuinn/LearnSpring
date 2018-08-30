package com.ronyo.learnspring.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.ronyo.learnspring.annotations")
public class AppConfig {

    @Bean
    public FortuneService madFortuneService(){
        return new MadFortuneService();
    }

    @Bean
    public Coach dancingCoach(){
        return new DancingCoach(madFortuneService());
    }

}
