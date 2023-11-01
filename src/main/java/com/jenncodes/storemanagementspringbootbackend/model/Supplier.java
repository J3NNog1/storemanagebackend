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
@Table(name= "supplier")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private long id;
    @Column(name= "company-name")
    private String companyName;
    @Column(name= "inventory-type")
    private String inventoryType;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "fk_add_p_o_id")
    private PurchaseOrder purchaseOrder;

}
