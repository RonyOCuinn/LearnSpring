package com.ronyo.learnspring.annotations;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    String[] fortunes = {"Bad luck", "Good luck", "Mediocre luck", "Try again"};

    Random random = new Random();

    @Override
    public String getFortune() {
        return fortunes[random.nextInt(fortunes.length)];
    }

}
