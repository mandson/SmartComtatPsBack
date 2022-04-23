package com.example.smartcompta.security.services;

import com.example.smartcompta.security.dto.PermitionDto;
import com.example.smartcompta.security.dto.RoleDto;

import java.util.List;

public interface PermitionService {
    List<PermitionDto> listPermition();
    PermitionDto save(PermitionDto dto);
    PermitionDto findById(Long id);
    // RoleDto findByEmailAndPassword(String email,String password);
    void delete(Long id);
    void update(  Long id);
}
