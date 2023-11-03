package com.jenncodes.storemanagementspringbootbackend;

import com.jenncodes.storemanagementspringbootbackend.model.*;
import com.jenncodes.storemanagementspringbootbackend.repository.*;
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
	private SupplierRepository supplierRepository;

	@Override
	public void run(String... args) throws Exception{
//		Supplier supplier = new Supplier();
//		supplier.setCompanyName("Johnson and jhonson");
//		supplier.setInventoryType("hygenie");
//
//		supplierRepository.save(supplier);
//
//		Supplier supplier1 = new Supplier();
//		supplier1.setCompanyName("Sony");
//		supplier1.setInventoryType("electronics");
//
//		supplierRepository.save(supplier1);
	}
//	@Autowired
//	private PurchaseOrderRepository purchaseOrderRepository;
//
//	@Override
//	public void run(String... args) throws Exception{
//		PurchaseOrder purchaseOrder = new PurchaseOrder();
//		purchaseOrder.setStoreSelection("use store id");
//		purchaseOrder.setQuantity(10.5);
//		purchaseOrder.setItemSelection("maybe use item id");
//		purchaseOrder.setSupplierDetails("supplier name");
//		purchaseOrder.setInvoiceDate("XX/XX/XX");
//		purchaseOrder.setPaymentStatus(true);
//		purchaseOrderRepository.save(purchaseOrder);
//
//		PurchaseOrder purchaseOrder1 = new PurchaseOrder();
//		purchaseOrder1.setStoreSelection("use store id");
//		purchaseOrder1.setQuantity(10.5);
//		purchaseOrder1.setItemSelection("maybe use item id");
//		purchaseOrder1.setSupplierDetails("supplier name");
//		purchaseOrder1.setInvoiceDate("XX/XX/XX");
//		purchaseOrder1.setPaymentStatus(true);
//		purchaseOrderRepository.save(purchaseOrder1);
//	}

//	@Autowired
//	private InventoryRepository inventoryRepository;
//
//	@Override
//	public void run(String... args) throws Exception{
//		Inventory inventory1 = new Inventory();
//		inventory1.setQuantity(3);
//		inventory1.setStoreSelection("Atlanta, GA");
//		inventory1.setItemSelection("apples");
//		inventoryRepository.save(inventory1);
//
//		Inventory inventory = new Inventory();
//		inventory.setQuantity(2);
//		inventory.setStoreSelection("Rome, GA");
//		inventory.setItemSelection("roses");
//		inventoryRepository.save(inventory);
//	}


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

//	@Autowired
//	private StoreRepository storeRepository;
//	@Override
//	public void run(String... args) throws Exception{
//		Store store = new Store();
//		store.setStoreName("Sam's Club Warehouse");
//		store.setStoreType("Warehouse");
//		store.setLocation("Atlanta, GA");
//		store.setContactInfo("(404) 347-3847");
//		store.setOpeningDate("pending");
//
//		Store store1 = new Store();
//		store1.setStoreName("Sam's Club Bakery");
//		store1.setStoreType("Bakery");
//		store1.setLocation("Rome, GA");
//		store1.setContactInfo("(404) 347-3847");
//		store1.setOpeningDate("Nov 2000");
//
//		storeRepository.save(store);
//		storeRepository.save(store1);
//	}

//	@Autowired
//	private ItemManagementRepository itemManagementRepository;
//
//	@Override
//	public void run (String... arg) throws Exception{
//		ItemManagement itemManagement = new ItemManagement();
//		itemManagement.setItemName("PS5");
//		itemManagement.setCategory("Electronics");
//		itemManagement.setDescription("Sony PlayStation");
//		itemManagement.setPrice(499.99);
//		itemManagement.setInitialQuantity(3);
//
//		ItemManagement itemManagement1 = new ItemManagement();
//		itemManagement1.setItemName("Fabuloso");
//		itemManagement1.setCategory("House hold goods");
//		itemManagement1.setDescription("Floor cleaning");
//		itemManagement1.setPrice(4.59);
//		itemManagement1.setInitialQuantity(10);
//
//
//	}

}
