package com.jenncodes.storemanagementspringbootbackend.repository;


import com.jenncodes.storemanagementspringbootbackend.model.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long> {
}
