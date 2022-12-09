package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	//Associa uma instancia do user repository nessa classe
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		//Este método é implementado a partir do commandLineRunner e tudo que estiver aqui dentro executa junto com a aplicação
		User u1 = new User(null, "Bob", "bob@gmail.com", "9999999", "12345");
		User u2 = new User(null, "Charlie", "charlie@gmail.com", "9999999", "12345");
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}
}
