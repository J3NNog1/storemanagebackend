package com.jenncodes.storemanagementspringbootbackend.controller;

import com.jenncodes.storemanagementspringbootbackend.exception.ResourceNotFoundException;


import com.jenncodes.storemanagementspringbootbackend.model.Supplier;
import com.jenncodes.storemanagementspringbootbackend.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/sams/supplier")
public class SupplierController {
    @Autowired
    private SupplierRepository supplierRepository;
    @GetMapping
    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }
    @PostMapping
    public Supplier createSupplier(@RequestBody Supplier supplier) {
        return supplierRepository.save(supplier);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Supplier> getSupplierById(@PathVariable long id){
        Supplier supplier = supplierRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Supplier does not exist with this id:" + id));
        return ResponseEntity.ok(supplier);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Supplier> updateSupplier(@PathVariable long id, @RequestBody Supplier supplierDetails) {
        Supplier updateSupplier = supplierRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Supplier order does not exist with this id:" + id ));
        updateSupplier.setCompanyName(supplierDetails.getCompanyName());
        updateSupplier.setInventoryType(supplierDetails.getInventoryType());

        supplierRepository.save(updateSupplier);
        return ResponseEntity.ok(updateSupplier);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteSupplier(@PathVariable long id) {
        Supplier supplier = supplierRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("This supplier has been deleted, " +
                        " please save the supplier's ID for your records: " + id ));
        supplierRepository.delete(supplier);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
