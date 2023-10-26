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
@Table(name= "item-management")
public class ItemManagement {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name= "item_name")
    private String itemName;
    @Column(name= "description")
    private String description;
    @Column(name= "category")
    private String category;
    @Column(name= "price")
    private double price;
    @Column(name= "initial_quantity")
    private double initialQuantity;
    //maybe use float



}
