package com.example.security.basicauth;

import com.example.security.basicauth.models.User;
import com.example.security.basicauth.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class BasicSecurityApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {

		SpringApplication.run(BasicSecurityApplication.class, args);
		System.out.println("Basic Security Started...");
	}


	@Override
	public void run(String... args) throws Exception {

		User user = new User();
		user.setEmail("vs@gmail.com");
		user.setPassword(bCryptPasswordEncoder.encode("vishwajeet"));
		user.setName("vishwajeet");
		user.setRole("ROLE_ADMIN");

		User user1 = new User();
		user1.setEmail("ZK@gmail.com");
		user1.setPassword(bCryptPasswordEncoder.encode("zeeshan"));
		user1.setName("zeeshan");
		user1.setRole("ROLE_ADMIN");

//		this.userRepository.save(user);

//		this.userRepository.save(user1);
	}
}
