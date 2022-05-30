package com.rakuten.croptracking;

//import java.util.HashSet;
//
//
//import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//import com.rakuten.croptracking.DAO.UserService;
//import com.rakuten.croptracking.models.Role;
//import com.rakuten.croptracking.models.User;
//import com.rakuten.croptracking.models.UserRole;


@SpringBootApplication
public class CropTrackingApplication implements CommandLineRunner {
	

	public static void main(String[] args) {
		
		
		SpringApplication.run(CropTrackingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		System.out.println("Start");
		
	}
}
