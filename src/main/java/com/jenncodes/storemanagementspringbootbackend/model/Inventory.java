package com.jenncodes.storemanagementspringbootbackend.model;

import jakarta.persistence.*;
//import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "inventory-management")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private long id;
    @Column(name= "store_selection")
    private String storeSelection;
    @Column(name= "item_selection")
    private String itemSelection;
    @Column(name= "quantity")
    private int quantity;


}
