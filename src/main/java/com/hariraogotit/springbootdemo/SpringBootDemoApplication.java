package com.hariraogotit.springbootdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}


	@Bean
	CommandLineRunner runner(ReservationRepository reservationRepository){
		return args -> {
			Arrays.asList("Hammer_Team, Cash_Team, ECN_Team, Edealer_Team, Exotics_Team".split(","))
					.forEach(n ->reservationRepository.save(new Reservation(n)));

			reservationRepository.findAll().forEach(System.out::println);

			reservationRepository.findByReservationName("Hammer_Team").forEach(System.out::println);
		};
	}

}
