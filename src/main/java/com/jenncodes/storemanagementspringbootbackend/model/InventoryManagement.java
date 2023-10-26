package com.jenncodes.storemanagementspringbootbackend.model;

import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "inventory-management")
public class InventoryManagement {

    @Column(name= "store_selection")
    private String storeSelection;
    @Column(name= "item_selection")
    private String itemSelection;
    @Column(name= "quantity")
    private String quantity;

}
