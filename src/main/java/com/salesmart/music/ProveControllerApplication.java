package com.salesmart.music;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ProveControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProveControllerApplication.class, args);
	}

}
