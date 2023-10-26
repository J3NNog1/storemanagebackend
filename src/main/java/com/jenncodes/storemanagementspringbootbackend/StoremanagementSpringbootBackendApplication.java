package com.jenncodes.storemanagementspringbootbackend;

import com.jenncodes.storemanagementspringbootbackend.model.Admin;
import com.jenncodes.storemanagementspringbootbackend.model.Store;
import com.jenncodes.storemanagementspringbootbackend.repository.StoreRepository;
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
//	@Autowired
//	private AdminRepository adminRepository;
//	@Override
//	public void run(String... args) throws Exception{
//		Admin admin = new Admin();
//		admin.setFirstName("Jennifer");
//		admin.setLastName("Doe");
//		admin.setEmailId("jenniferdoe@gmail.com");
//		adminRepository.save(admin);
//
//		Admin admin1 = new Admin();
//		admin1.setFirstName("Jackson");
//		admin1.setLastName("Smith");
//		admin1.setEmailId("jacksonsmith@gmail.com");
//		adminRepository.save(admin1);
//	}

	@Autowired
	private StoreRepository storeRepository;
	@Override
	public void run(String... args) throws Exception{
		Store store = new Store();
		store.setStoreName("Sam's Club Warehouse");
		store.setStoreType("Warehouse");
		store.setLocation("Atlanta, GA");
		store.setContactInfo("(404) 347-3847");
		store.setOpeningDate("pending");

		Store store1 = new Store();
		store1.setStoreName("Sam's Club Bakery");
		store1.setStoreType("Bakery");
		store1.setLocation("Rome, GA");
		store1.setContactInfo("(404) 347-3847");
		store1.setOpeningDate("Nov 2000");

		storeRepository.save(store);
		storeRepository.save(store1);
	}


}
