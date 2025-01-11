package com.uit.nishint.week1Introduction.introductionToSpringBoot2025;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="deploy.env",havingValue = "production")
public class ProdDB implements DB
{
    public String getData()
    {
        return "Hi I am ProdDB ,Made by Nishint Goyal";
    }
}
