package com.example.security.basicauth.repo;

import com.example.security.basicauth.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("select u from User as u where u.email= :email")
    public User getUserByUsername(@Param("email") String email);

}
