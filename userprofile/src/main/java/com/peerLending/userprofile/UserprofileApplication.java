package com.peerLending.userprofile;

import com.peerLending.userprofile.domain.model.User;
import com.peerLending.userprofile.domain.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class UserprofileApplication implements CommandLineRunner {
	@Autowired
	private final UserRepository userRepository;

	public UserprofileApplication(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(UserprofileApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("Anne", "Anne", "Daniel", 25, "Astronaut", LocalDate.now()));

	}
}
