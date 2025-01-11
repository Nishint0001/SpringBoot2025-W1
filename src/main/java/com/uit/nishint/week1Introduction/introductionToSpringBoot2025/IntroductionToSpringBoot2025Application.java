package com.uit.nishint.week1Introduction.introductionToSpringBoot2025;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringBoot2025Application implements CommandLineRunner
{
	@Autowired
	DBService dbService;

	public static void main(String[] args)
	{
		SpringApplication.run(IntroductionToSpringBoot2025Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		System.out.println(dbService.getData());
	}
}
