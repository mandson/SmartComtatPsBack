package com.example.smartcompta.security.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;


@Data
@Entity
@NoArgsConstructor @AllArgsConstructor
public class Role  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameRole;
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String codeRole;
    private String descriptionRole;
    private String userCrateName;

    @OneToMany(mappedBy ="roles" )
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Linkacces> linkacces;

    @OneToMany(mappedBy ="roles" )
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<User> users;

}
