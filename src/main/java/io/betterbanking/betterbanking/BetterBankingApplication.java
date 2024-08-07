package io.betterbanking.betterbanking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "io.betterbanking")
public class BetterBankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BetterBankingApplication.class, args);
	}

}
