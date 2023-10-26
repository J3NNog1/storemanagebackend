package com.jenncodes.storemanagementspringbootbackend.controller;

import com.jenncodes.storemanagementspringbootbackend.model.Store;
import com.jenncodes.storemanagementspringbootbackend.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("sams/stores")
public class StoreController {
    @Autowired
    private StoreRepository storeRepository;

    @GetMapping
    public List<Store> getAllStores() {
        return storeRepository.findAll();

    }

}
