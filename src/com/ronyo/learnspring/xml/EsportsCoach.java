package com.ronyo.learnspring.xml;

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
