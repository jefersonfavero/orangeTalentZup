package br.com.alura.FIPE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FipeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FipeApplication.class, args);
	}

}
