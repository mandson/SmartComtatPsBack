package com.example.smartcompta.security.repository;

import com.example.smartcompta.security.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    //List<Devise> findDeviseByCodedev(String codedev);

    Optional<User> findUserByEmailAndPassword (String email,String password);
    Optional<User> findUserByEmail(String email);
    Optional<User> findUserByFirstName(String firstName);

}
