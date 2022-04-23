package com.example.smartcompta.security.repository;

import com.example.smartcompta.security.entities.Linkacces;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LinkaccesRepository  extends JpaRepository<Linkacces,Long> {
    List<Linkacces> findAllByIdRole(Long idRole);
   List<Linkacces> findAllByIdRoleAndIdPermition(Long idRole,Long idPermition);
    Linkacces findByIdRoleAndIdPermition(Long idRole,Long idPermition);

    // RoleDto findByEmailAndPassword(String email,String password);

}
