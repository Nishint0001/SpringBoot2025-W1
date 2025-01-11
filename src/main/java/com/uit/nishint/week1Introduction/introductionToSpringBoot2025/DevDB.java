package com.uit.nishint.week1Introduction.introductionToSpringBoot2025;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;


@Component
@ConditionalOnProperty(name="deploy.env",havingValue = "development")
public class DevDB implements DB
{
  public String getData()
  {
      return "Hi I am DevData,Made by Nishint Goyal";
  }
}
