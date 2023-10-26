package com.jenncodes.storemanagementspringbootbackend.repository;

import com.jenncodes.storemanagementspringbootbackend.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
}
