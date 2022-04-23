package com.example.smartcompta.security.services;

import com.example.smartcompta.security.dto.LinkaccesDto;
import com.example.smartcompta.security.dto.PermitionDto;

import java.util.List;

    public interface Linkacces {
    List<LinkaccesDto> listAccesPermitionRole();
    LinkaccesDto save(LinkaccesDto dto);
    LinkaccesDto findById(Long id);
    // RoleDto findByEmailAndPassword(String email,String password);

    void delete(Long id);
    void update(  Long id);
        List<LinkaccesDto> findAllpermissionsByRole(Long idRole);
        List<LinkaccesDto> findListeByIdRoleAndIdPermition(Long idRole, Long idPermition);
        LinkaccesDto findOneByIdRoleAndIdPermition(Long idRole, Long idPermition);


    }