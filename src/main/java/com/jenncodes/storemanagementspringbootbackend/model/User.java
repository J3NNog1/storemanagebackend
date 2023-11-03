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
@Table(name= "users")


public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private long id;
    @Column(name= "user_name")
    private String userName;
    @Column(name= "password")
    private String password;
    @Column(name= "role_type")
    private String roleType;


}
