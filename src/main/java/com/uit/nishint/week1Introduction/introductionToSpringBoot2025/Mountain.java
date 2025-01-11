package com.uit.nishint.week1Introduction.introductionToSpringBoot2025;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Mountain
{
    void myName()
    {
        System.out.println("My name is Nishint");
        System.out.println("I am a fighter ");
    }

    @PostConstruct
    void beforeBean()
    {
        System.out.println("This will be created before bean");
    }

    @PreDestroy
    void afterBeanUsed()
    {
        System.out.println("This will occur when we closed bean");
    }
}
