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
@Table(name= "store")
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name= "store_name")
    private String storeName;
    @Column(name= "location")
    private String location;
    @Column(name= "contact_info")
    private String contactInfo;
    @Column(name= "store_type")
    private String storeType;
    @Column(name= "opening_date")
    private String openingDate;


}
