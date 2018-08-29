package com.ronyo.learnspring.annotations;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "I am the REST Fortune Service";
    }
}
