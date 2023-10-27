package com.jenncodes.storemanagementspringbootbackend.repository;

import com.jenncodes.storemanagementspringbootbackend.model.ItemManagement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemManagementRepository extends JpaRepository<ItemManagement, Long> {
}
