package com.ronyo.learnspring.annotations;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "I am the database fortune service";
    }
}
