package com.jenncodes.storemanagementspringbootbackend.controller;

import com.jenncodes.storemanagementspringbootbackend.exception.ResourceNotFoundException;
import com.jenncodes.storemanagementspringbootbackend.model.Admin;
import com.jenncodes.storemanagementspringbootbackend.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/sams/admin")
public class AdminController {
    @Autowired
    private AdminRepository adminRepository;

    @GetMapping
    public List<Admin> getAllAdmins(){
        return adminRepository.findAll();
    }
    //build create employee rest api
    @PostMapping
    public Admin createAdmin(@RequestBody Admin admin){
        return adminRepository.save(admin);
    }
    //build get employee by id Rest API
    @GetMapping("{id}")
    public ResponseEntity<Admin> getAdminById(@PathVariable long id){
        Admin admin = adminRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Admin does not exist with this id:" + id));
        return ResponseEntity.ok(admin);
    }

    @PutMapping("{id}")
    public ResponseEntity<Admin> updateAdmin(@PathVariable long id, @RequestBody Admin adminDetails) {
        Admin updateAdmin = adminRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Admin does not exist with this id:" + id));
        updateAdmin.setFirstName(adminDetails.getFirstName());
        updateAdmin.setLastName(adminDetails.getLastName());
        updateAdmin.setEmailId(adminDetails.getEmailId());

        adminRepository.save(updateAdmin);
        return ResponseEntity.ok(updateAdmin);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteAdmin(@PathVariable long id) {
        Admin admin = adminRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Admin does not exist with this id:" + id));
        adminRepository.delete(admin);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
