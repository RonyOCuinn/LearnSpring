package com.ronyo.learnspring;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    BaseballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Do 30 mins in batting cage";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
