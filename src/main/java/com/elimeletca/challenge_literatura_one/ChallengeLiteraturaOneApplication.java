package com.elimeletca.challenge_literatura_one;

import com.elimeletca.challenge_literatura_one.main.Main;
import com.elimeletca.challenge_literatura_one.repository.LibrosRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeLiteraturaOneApplication implements CommandLineRunner {

	@Autowired
	private LibrosRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(ChallengeLiteraturaOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main principal = new Main(repository);
		principal.mostrarMenu();
	}
}
