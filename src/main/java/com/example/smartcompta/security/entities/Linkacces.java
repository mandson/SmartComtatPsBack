package com.example.smartcompta.security.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@NoArgsConstructor @AllArgsConstructor
public class Linkacces implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "roles_id")
    private Role roles;

    @ManyToOne
    @JoinColumn(name = "permition_id")

    private Permition permitions;

    private String userCrateName;
    private Long idRole;
    private Long idPermition;
}
