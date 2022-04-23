package com.example.smartcompta.security.services;

import com.example.smartcompta.security.dto.RoleDto;

import java.util.List;

public interface RoleService {


    List<RoleDto> listRole();
    RoleDto save(RoleDto dto);
    RoleDto findById(Long id);

   // RoleDto findByEmailAndPassword(String email,String password);
    void delete(Long id);
    void update(  Long id);
}
