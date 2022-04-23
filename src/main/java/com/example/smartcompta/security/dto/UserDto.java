package com.example.smartcompta.security.dto;

import com.example.smartcompta.security.entities.Role;
import com.example.smartcompta.security.entities.User;
import lombok.Builder;
import lombok.Data;

import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.Date;
@Builder
@Data
public class UserDto {

    private Long id;
    private String userId;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String profilImage;
    private Date lastLogingDate;
    private  Date cratedAt;
    private Boolean isActive;
    private Boolean isNotLocked;
    private Role roles;
    private Long idRole;
    public static UserDto fromEntity(User user){
        if (user==null){
            return null;
        }
        return UserDto.builder()
                .id( user.getId() )
                .userId( user.getUserId() )
                .firstName( user.getFirstName() )
                .lastName( user.getLastName() )
                .password( user.getPassword() )
                .email( user.getEmail() )
                .profilImage( user.getProfilImage() )
                .lastLogingDate( user.getLastLogingDate() )
                .cratedAt( user.getCratedAt() )
                .isActive( user.getIsActive() )
                .isNotLocked( user.getIsNotLocked() )
                .roles(user.getRoles())
                .idRole( user.getIdRole() )
                .build();
    }

    public  static User toEntity(UserDto userDto){
        if (userDto==null){
            return null;
        }
        User user = new User();
        user.setId( userDto.getId() );
        user.setUserId( userDto.getUserId() );
        user.setFirstName( userDto.getFirstName() );
        user.setLastName( userDto.getLastName() );
        user.setPassword( userDto.getPassword() );
        user.setPassword( userDto.getPassword() );
        user.setEmail( userDto.getEmail() );
        user.setProfilImage( userDto.getProfilImage() );
        user.setLastLogingDate( userDto.getLastLogingDate() );
        user.setCratedAt( new Date() );
        user.setIsActive(userDto.getIsActive());
        user.setIsNotLocked( userDto.getIsNotLocked() );
        user.setIdRole( userDto.getIdRole() );
        user.setRoles(  RoleDto.toEntity( RoleDto.builder()
                        .id( userDto.getIdRole() )
                .build() ));
        return user;
    }
}
