package com.jenncodes.storemanagementspringbootbackend.model;


import com.jenncodes.storemanagementspringbootbackend.repository.PurchaseOrderRepository;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "supplier")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn (name="purchase_order_id", referencedColumnName = "id")

//    private PurchaseOrder purchaseOrder;

    @Column(name= "id")
    private long id;
    @Column(name= "company-name")
    private String companyName;
    @Column(name= "inventory-type")
    private String inventoryType;
//    @OneToOne(mappedBy = "supplier")
//    private PurchaseOrder purchaseOrder
//    public void assignPurchaseOrder(PurchaseOrder purchaseOrder){
//        this.purchaseOrder = purchaseOrder;
//    }


}
