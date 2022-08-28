package com.app.rickymorty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppRickymortyApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppRickymortyApplication.class, args);
	}

}
