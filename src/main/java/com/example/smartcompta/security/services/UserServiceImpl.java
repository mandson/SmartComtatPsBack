package com.example.smartcompta.security.services;

import com.example.smartcompta.security.dto.RoleDto;
import com.example.smartcompta.security.dto.UserDto;
import com.example.smartcompta.security.entities.User;
import com.example.smartcompta.security.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
@Service
@Slf4j
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserDto> listUser() {

        return userRepository.findAll().stream()
                .map( UserDto::fromEntity)
                .collect( Collectors.toList())
                ;    }

    @Override
    public UserDto save(UserDto dto) {

        return  UserDto.fromEntity(
                userRepository.save(UserDto.toEntity(dto))
        );
    }

    @Override
    public UserDto findById(Long id) {

        if (id == null){
            return  null;
        }


        return userRepository.findById(id)
                .map(UserDto::fromEntity)
                .orElseThrow(() -> new EntityNotFoundException(

                        "Aucune permition avec l'ID = "+id+ "n'a ete trouver dans la base de BDD")
                );    }

    @Override
    public UserDto findUserByEmailAndPassword(String email, String password) {


     //   Optional<User> user = userRepository.findUserByEmailAndPassword(email, password );


        return userRepository.findUserByEmail(email)
                .map(UserDto::fromEntity)
                .orElseThrow(() -> new EntityNotFoundException(

                        "Aucune permition avec l'ID = "+password+ "n'a ete trouver dans la base de BDD")
                );
    }

    @Override
    public UserDto findUserByFirstName(String firstName) {



        return userRepository.findUserByFirstName(firstName)
                .map(UserDto::fromEntity)
                .orElseThrow(() -> new EntityNotFoundException(

                        "Aucune permition avec l'ID = "+firstName+ "n'a ete trouver dans la base de BDD")
                );
    }

    @Override
    public UserDto findUserByEmail(String email) {


        UserDto verifuser = userRepository.findUserByEmail( email )

                .map( UserDto::fromEntity )
                .orElseThrow( () -> new EntityNotFoundException(

                        "Aucune email avec= " + email + "n'a ete trouver dans la base de BDD" )
                );
        if (verifuser.getPassword().equals( "password" )){
        return verifuser;}
        else return null;
    }

    @Override
    public void delete(Long id) {
        userRepository.findById( id );
    }

    @Override
    public void update(Long id) {

    }
}
