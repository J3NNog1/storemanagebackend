package com.jenncodes.storemanagementspringbootbackend;

import com.jenncodes.storemanagementspringbootbackend.model.Admin;
import com.jenncodes.storemanagementspringbootbackend.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoremanagementSpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StoremanagementSpringbootBackendApplication.class, args);
	}
	@Autowired
	private AdminRepository adminRepository;
	@Override
	public void run(String... args) throws Exception{
		Admin admin = new Admin();
		admin.setFirstName("Jennifer");
		admin.setLastName("Doe");
		admin.setEmailId("jenniferdoe@gmail.com");
		adminRepository.save(admin);

		Admin admin1 = new Admin();
		admin1.setFirstName("Jackson");
		admin1.setLastName("Smith");
		admin1.setEmailId("jacksonsmith@gmail.com");
		adminRepository.save(admin1);
	}

}
