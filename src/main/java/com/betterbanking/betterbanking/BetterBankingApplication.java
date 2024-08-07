package com.betterbanking.betterbanking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.betterbanking")
public class BetterBankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BetterBankingApplication.class, args);
	}

}
