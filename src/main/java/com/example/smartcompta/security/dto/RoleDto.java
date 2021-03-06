package com.example.smartcompta.security.dto;

import com.example.smartcompta.security.entities.Permition;
import com.example.smartcompta.security.entities.Role;
import com.example.smartcompta.security.entities.User;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;

@Builder
@Data
@Transactional

public class RoleDto {

    private Long id;
    private String nameRole;
    private String codeRole;
    private String descriptionRole;
   // private Long idPermition;
    private String userCrateName;

    // private Permition permitions;


    public static RoleDto fromEntity(Role role){
        if (role==null){
            return null;
        }
        return RoleDto.builder()
                .id( role.getId() )
                .nameRole( role.getNameRole() )
                .codeRole( role.getCodeRole() )
                .descriptionRole( role.getDescriptionRole() )
          //      .idPermition( role.getIdPermition() )
                .userCrateName( role.getUserCrateName() )
                //.permitions( role.getPermitions() )
                .build();
    }

    public  static Role toEntity(RoleDto roleDto){
        if (roleDto==null){
            return null;
        }
        Role role = new Role();
        role.setId( roleDto.getId() );
        role.setNameRole( roleDto.getNameRole() );
        role.setCodeRole( UUID.randomUUID().toString().toLowerCase() );
        role.setDescriptionRole( roleDto.getDescriptionRole() );
      //  role.setIdPermition( roleDto.getIdPermition() );
        role.setUserCrateName( roleDto.getUserCrateName() );
       // role.setPermitions( roleDto.getPermitions() );
        return role;
    }
}

