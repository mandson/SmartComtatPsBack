package com.example.smartcompta.security.entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor @AllArgsConstructor
public class User  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userId;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String profilImage;
    private Date lastLogingDate;
    private  Date cratedAt;
    private Long idRole;
    private Boolean isActive;
    private Boolean isNotLocked;

    @ManyToOne
    private Role roles;
}
