package com.training.boot.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class FlightScheduleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightScheduleServiceApplication.class, args);
	}

}
