package com.example.smartcompta.security.web.controller;

import com.example.smartcompta.security.dto.UserDto;
import com.example.smartcompta.security.services.UserService;
import com.example.smartcompta.security.web.ApiRest.UserApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class UserController implements UserApi {
    @Autowired
    UserService userService;

    @Override
    public List<UserDto> findAll() {
        return userService.listUser();
    }

    @Override
    public UserDto save(UserDto dto) {
        return userService.save( dto );
    }

    @Override
    public UserDto findById(Long id) {
        return userService.findById( id );
    }



    @Override
    public UserDto findUserByFirstname(String firstname) {
        return userService.findUserByFirstName( firstname );
    }

    @Override
    public UserDto findUserByEmail(String email ){
        return userService.findUserByEmail(email);
    }

    @Override
    public void modifier(Long id) {

    }

    @Override
    public void delete(Long id) {
        userService.delete( id );
    }
}
