package com.savage.rest_inital.repositories;

import com.savage.rest_inital.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface IUserRepository extends JpaRepository<User, String> {

    ArrayList<User> findByPriority(Integer priority);

}
