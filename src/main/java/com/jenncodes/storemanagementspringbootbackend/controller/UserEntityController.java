package com.jenncodes.storemanagementspringbootbackend.controller;

import com.jenncodes.storemanagementspringbootbackend.exception.ResourceNotFoundException;
import com.jenncodes.storemanagementspringbootbackend.model.UserEntity;
import com.jenncodes.storemanagementspringbootbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/sams/user")
public class UserEntityController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<UserEntity> getAllUsers(){
        return userRepository.findAll();
    }
    //build create employee rest api
    @PostMapping
    public UserEntity createUser(@RequestBody UserEntity userEntity){
        return userRepository.save(userEntity);
    }
    //build get employee by id Rest API
    @GetMapping("{id}")
    public ResponseEntity<UserEntity> getUserById(@PathVariable long id){
        UserEntity userEntity = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User does not exist with this id:" + id));
        return ResponseEntity.ok(userEntity);
    }

    @PutMapping("{id}")
    public ResponseEntity<UserEntity> updateUser(@PathVariable long id, @RequestBody UserEntity userEntityDetails) {
        UserEntity updateUserEntity = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User does not exist with this id:" + id));
        updateUserEntity.setUserName(userEntityDetails.getUserName());
        updateUserEntity.setPassword(userEntityDetails.getPassword());
        userRepository.save(updateUserEntity);
        return ResponseEntity.ok(updateUserEntity);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable long id) {
        UserEntity userEntity = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User does not exist with this id:" + id));
        userRepository.delete(userEntity);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
