package com.jenncodes.storemanagementspringbootbackend.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "purchase-orders")
public class PurchaseOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name= "store_selection")
    private String storeSelection;
    @Column(name= "item_selection")
    private String itemSelection;
    @Column(name= "supplier_details")
    private String supplierDetails;
    @Column(name= "invoice_date")
    private String invoiceDate;
    @Column(name= "quantity")
    private double quantity;
    @Column(name="payment_status")
    private String paymentStatus;


}
