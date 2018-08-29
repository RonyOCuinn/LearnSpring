package com.ronyo.learnspring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsBeanScopeDemoApp {

    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coachOne = context.getBean("tennisCoach", Coach.class);

        context.close();

    }

}
