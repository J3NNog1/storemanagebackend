package com.jenncodes.storemanagementspringbootbackend.service;

import com.jenncodes.storemanagementspringbootbackend.model.User;
import com.jenncodes.storemanagementspringbootbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCrypt;



@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User authenticateUser(String userName, String password) {
        //implement authentication logic
        //verify username and password from database
        //if valid return user object   else return null

        User user = userRepository.findByUserName(userName);
        if (user != null && BCrypt.checkpw(password, user.getPassword())) {
            return user;
        }
        return null;
    }

    public User findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }
}
