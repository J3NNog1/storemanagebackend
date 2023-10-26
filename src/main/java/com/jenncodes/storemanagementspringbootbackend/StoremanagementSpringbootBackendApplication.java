package com.jenncodes.storemanagementspringbootbackend;

import com.jenncodes.storemanagementspringbootbackend.model.Employee;
import com.jenncodes.storemanagementspringbootbackend.repository.EmployeeRepository;
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
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception{
		Employee employee = new Employee();
		employee.setFirstName("Jennifer");
		employee.setLastName("Doe");
		employee.setEmailId("jenniferdoe@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Jackson");
		employee1.setLastName("Smith");
		employee1.setEmailId("jacksonsmith@gmail.com");
		employeeRepository.save(employee1);
	}

}
