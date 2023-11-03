package com.jenncodes.storemanagementspringbootbackend.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import javax.security.auth.Subject;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name= "purchase-orders")
public class PurchaseOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

//    @JsonIgnore
//    @OneToMany(mappedBy = "purchase_order")
//    private Set<Supplier> supplier = new HashSet<>();

    @Column(name= "id")
    private long id;
    @Column(name= "store_selection")
    private String storeSelection;
    @Column(name= "item_selection")
    private String itemSelection;
    @Column(name= "invoice_date")
    private String invoiceDate;
    @Column(name= "quantity")
    private double quantity;
    @Column(name="payment_status")
    private boolean paymentStatus;


    //supplier_add_id - default fk column name
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_add_supplier_id")
//    private Supplier supplier;



}
