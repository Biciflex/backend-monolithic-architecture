package com.upc.biciflex.service.impl;

import com.upc.biciflex.model.User;
import com.upc.biciflex.repository.UserRepository;
import com.upc.biciflex.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long user_id) {
        return userRepository.findById(user_id).orElse(null);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long user_id) {
        userRepository.deleteById(user_id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
