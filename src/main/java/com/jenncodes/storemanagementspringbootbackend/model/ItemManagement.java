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
@Table(name= "itemmanagement")
public class ItemManagement {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name= "item_name")
    private String itemName;
    @Column(name= "description")
    private String description;
    @Column(name= "first_name")
    private String category;
    @Column(name= "first_name")
    private double price;
    @Column(name= "first_name")
    private double initialQuantity;
    //maybe use float



}
