package com.ronyo.learnspring.annotations;

import org.springframework.stereotype.Component;

@Component
public class MadFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "A plane engine will land on your house tonight";
    }
}
