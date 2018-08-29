package com.ronyo.learnspring.annotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "You will do great!";
    }
}
