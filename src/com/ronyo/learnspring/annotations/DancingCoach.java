package com.ronyo.learnspring.annotations;

import org.springframework.stereotype.Component;

@Component
public class DancingCoach implements Coach {

    private final FortuneService fortuneService;

    public DancingCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Do a tango";
    }

    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}
