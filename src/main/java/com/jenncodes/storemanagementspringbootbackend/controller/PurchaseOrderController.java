package com.jenncodes.storemanagementspringbootbackend.controller;

import com.jenncodes.storemanagementspringbootbackend.exception.ResourceNotFoundException;
import com.jenncodes.storemanagementspringbootbackend.model.PurchaseOrder;
import com.jenncodes.storemanagementspringbootbackend.model.Store;
import com.jenncodes.storemanagementspringbootbackend.repository.PurchaseOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/sams/purchase_order")
public class PurchaseOrderController {

    @Autowired
    private PurchaseOrderRepository purchaseOrderRepository;
    @GetMapping
    public List<PurchaseOrder> getAllPurchaseOrders() {
        return purchaseOrderRepository.findAll();
    }
    @PostMapping
    public PurchaseOrder createPurchaseOrder(@RequestBody PurchaseOrder purchaseOrder) {
        return purchaseOrderRepository.save(purchaseOrder);
    }
    @GetMapping("/{id}")
    public ResponseEntity<PurchaseOrder> getPurchaseOrderById(@PathVariable long id){
        PurchaseOrder purchaseOrder = purchaseOrderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Purchase Order does not exist with this id:" + id));
        return ResponseEntity.ok(purchaseOrder);
    }
    @PutMapping("/{id}")
    public ResponseEntity<PurchaseOrder> updatePurchaseOrder(@PathVariable long id, @RequestBody PurchaseOrder purchaseOrderDetails) {
        PurchaseOrder updatePurchaseOrder = purchaseOrderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Purchase order does not exist with this id:" + id ));
        updatePurchaseOrder.setStoreSelection(purchaseOrderDetails.getStoreSelection());
        updatePurchaseOrder.setItemSelection(purchaseOrderDetails.getItemSelection());
        updatePurchaseOrder.setSupplierDetails(purchaseOrderDetails.getSupplierDetails());
        updatePurchaseOrder.setInvoiceDate(purchaseOrderDetails.getInvoiceDate());
        updatePurchaseOrder.setQuantity(purchaseOrderDetails.getQuantity());
        updatePurchaseOrder.setPaymentStatus(purchaseOrderDetails.isPaymentStatus());
        purchaseOrderRepository.save(updatePurchaseOrder);
        return ResponseEntity.ok(updatePurchaseOrder);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteStore(@PathVariable long id) {
        PurchaseOrder purchaseOrder = purchaseOrderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("This purchase order has been deleted, " +
                        " please save the purchase order ID for your records: " + id ));
        purchaseOrderRepository.delete(purchaseOrder);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
