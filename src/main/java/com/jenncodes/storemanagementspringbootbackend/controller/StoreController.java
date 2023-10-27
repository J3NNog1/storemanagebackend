package com.jenncodes.storemanagementspringbootbackend.controller;

import com.jenncodes.storemanagementspringbootbackend.exception.ResourceNotFoundException;
import com.jenncodes.storemanagementspringbootbackend.model.Store;
import com.jenncodes.storemanagementspringbootbackend.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    //below i created a post method for adding to my database
    @PostMapping
    public Store createStore(@RequestBody Store store) {
        return storeRepository.save(store);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Store> getStoreById(@PathVariable long id){
        Store store = storeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Store does not exist with this id:" + id));
        return ResponseEntity.ok(store);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Store> updateStore(@PathVariable long id, @RequestBody Store storeDetails) {
        Store updateStore = storeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Store does not exist with this id:" + id ));
        updateStore.setStoreType(storeDetails.getStoreType());
        updateStore.setStoreName(storeDetails.getStoreName());
        updateStore.setLocation(storeDetails.getLocation());
        updateStore.setContactInfo(storeDetails.getContactInfo());
        updateStore.setOpeningDate(storeDetails.getOpeningDate());
        storeRepository.save(updateStore);
        return ResponseEntity.ok(updateStore);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteStore(@PathVariable long id) {
        Store store = storeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Store does not exist with this id: " + id ));
        storeRepository.delete(store);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
