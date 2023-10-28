package com.jenncodes.storemanagementspringbootbackend.controller;

import com.jenncodes.storemanagementspringbootbackend.exception.ResourceNotFoundException;
import com.jenncodes.storemanagementspringbootbackend.model.Inventory;
import com.jenncodes.storemanagementspringbootbackend.model.ItemManagement;
import com.jenncodes.storemanagementspringbootbackend.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/sams/inventory")
public class InventoryController {
    @Autowired
    private InventoryRepository inventoryRepository;

    //Get index in postman
    @GetMapping
    public List<Inventory> getAllInventory() {
        return inventoryRepository.findAll();
    }
    //Post create in postman
    @PostMapping
    public Inventory createInventory(@RequestBody Inventory inventory) {
        return inventoryRepository.save(inventory);
    }
    //Get Show in postman
    @GetMapping("/{id}")
    public ResponseEntity<Inventory> getInventoryById(@PathVariable long id){
        Inventory inventory = inventoryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Inventory does not exist with this id:" + id));
        return ResponseEntity.ok(inventory);
    }
    //Put Update in postman
    @PutMapping("/{id}")
    public ResponseEntity<Inventory> updateInventory(@PathVariable long id, @RequestBody Inventory inventoryDetails) {
        Inventory updateInventory = inventoryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Inventory with this id does not exist" + id));
        updateInventory.setStoreSelection(inventoryDetails.getStoreSelection());
        updateInventory.setItemSelection(inventoryDetails.getItemSelection());
        updateInventory.setQuantity(inventoryDetails.getQuantity());

        Inventory updatedInventory = inventoryRepository.save(updateInventory);
        return ResponseEntity.ok(updateInventory);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteInventory(@PathVariable long id) {
        Inventory inventory = inventoryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Inventory does not exist with this id:" + id));
        inventoryRepository.delete(inventory);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
