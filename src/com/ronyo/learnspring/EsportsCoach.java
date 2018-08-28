package com.ronyo.learnspring;

public class EsportsCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice your APM!";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
