package com.example.smartcompta.security.repository;

import com.example.smartcompta.security.entities.Permition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermitionRepository  extends JpaRepository<Permition,Long> {
}
