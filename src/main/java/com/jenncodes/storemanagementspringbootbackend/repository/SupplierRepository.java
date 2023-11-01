package com.jenncodes.storemanagementspringbootbackend.repository;

import com.jenncodes.storemanagementspringbootbackend.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
