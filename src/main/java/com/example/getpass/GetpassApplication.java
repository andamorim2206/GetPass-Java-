package com.example.getpass;

import com.example.getpass.controller.GetpassController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GetpassApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetpassApplication.class, args);

		GetpassController rota = new GetpassController();

		rota.get();
	}

}
