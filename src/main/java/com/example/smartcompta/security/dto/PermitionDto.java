package com.example.smartcompta.security.dto;

import com.example.smartcompta.security.entities.Permition;
import com.example.smartcompta.security.entities.Role;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
@Builder
@Data
public class PermitionDto {
    private Long id;
    private String codePermition;
    private String description;


    public static PermitionDto fromEntity(Permition permition){
        if (permition==null){
            return null;
        }
        return PermitionDto.builder()
                .id( permition.getId() )
                .codePermition( permition.getCodePermition() )
                .description( permition.getDescription() )
                .build();
    }

    public  static Permition toEntity(PermitionDto permitionDto){
        if (permitionDto==null){
            return null;
        }
        Permition permition = new Permition();
        permition.setId( permitionDto.getId() );
        permition.setCodePermition( permitionDto.getCodePermition() );
        permition.setDescription( permitionDto.getDescription() );

        return permition;
    }
}
