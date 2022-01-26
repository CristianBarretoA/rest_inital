package com.savage.rest_inital.services;

import com.savage.rest_inital.models.User;
import com.savage.rest_inital.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    IUserRepository iUserRepository;

    public ArrayList<User> getAll() {
        return (ArrayList<User>) iUserRepository.findAll();
    }

    public User saveUser(User user) {
        return iUserRepository.save(user);
    }

    public Optional<User> getUserById(String id) {
        return iUserRepository.findById(id);
    }

    public ArrayList<User> getUsersByPriority(Integer priority) {
        return iUserRepository.findByPriority(priority);
    }

    public boolean deleteUser(String id) {
        try {
            iUserRepository.deleteById(id);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }


}
