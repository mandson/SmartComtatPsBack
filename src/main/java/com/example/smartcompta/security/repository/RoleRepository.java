package com.example.smartcompta.security.repository;

import com.example.smartcompta.security.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
