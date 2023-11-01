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
@Table(name= "admins")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private long id;
    @Column(name= "first_name")
    private String firstName;
    @Column(name= "last_name")
    private String lastName;
    @Column(name= "email_id")
    private String emailId;
    @Column(name= "role_type")
    private String roleType;

    //address_add_

}
