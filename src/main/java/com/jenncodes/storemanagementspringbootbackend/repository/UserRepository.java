package com.jenncodes.storemanagementspringbootbackend.repository;

import com.jenncodes.storemanagementspringbootbackend.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByUserName(String userName);
    Boolean existsByUserName(String userName);
    //all crud database methods
}
