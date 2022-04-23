package com.example.smartcompta.security.services;

import com.example.smartcompta.security.dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> listUser();
    UserDto save(UserDto dto);
    UserDto findById(Long id);
    UserDto findUserByEmailAndPassword (String email,String password);
    UserDto findUserByFirstName (String firstName);
    UserDto findUserByEmail (String email);

    void delete(Long id);
    void update(  Long id);

}
