package com.jenncodes.storemanagementspringbootbackend.controller;

import com.jenncodes.storemanagementspringbootbackend.exception.ResourceNotFoundException;
import com.jenncodes.storemanagementspringbootbackend.model.ItemManagement;
import com.jenncodes.storemanagementspringbootbackend.repository.ItemManagementRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sams/items")
public class ItemManagementController {

    @Autowired
    private ItemManagementRepository itemManagementRepository;

    @GetMapping
    public List<ItemManagement> getAllItemManagement() {
        return itemManagementRepository.findAll();
    }
    @PostMapping
    public ItemManagement createItemManagement(@RequestBody ItemManagement itemManagement) {
        return itemManagementRepository.save(itemManagement);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ItemManagement> getItemManagementById(@PathVariable long id) {
        ItemManagement itemManagement = itemManagementRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Item with this id does not exist:" + id));
        return ResponseEntity.ok(itemManagement);
    }
    @PutMapping("/{id}")
    public ResponseEntity<ItemManagement> updateItemManagement(@PathVariable long id, @RequestBody ItemManagement itemManagementDetails) {
        ItemManagement updateItemManagement = itemManagementRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Item with this id does not exist" + id));
        updateItemManagement.setItemName(itemManagementDetails.getItemName());
        updateItemManagement.setDescription(itemManagementDetails.getDescription());
        updateItemManagement.setCategory(itemManagementDetails.getCategory());
        updateItemManagement.setPrice(itemManagementDetails.getPrice());
        updateItemManagement.setInitialQuantity(itemManagementDetails.getInitialQuantity());

        ItemManagement updatedItem = itemManagementRepository.save(updateItemManagement);
        return ResponseEntity.ok(updateItemManagement);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteItemManagement(@PathVariable long id) {
        ItemManagement itemManagement = itemManagementRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Item does not exist with this id:" + id));
                itemManagementRepository.delete(itemManagement);
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }






}
