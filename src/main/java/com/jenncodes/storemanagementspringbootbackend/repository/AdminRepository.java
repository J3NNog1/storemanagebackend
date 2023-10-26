package com.jenncodes.storemanagementspringbootbackend.repository;

import com.jenncodes.storemanagementspringbootbackend.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    //all crud database methods
}
