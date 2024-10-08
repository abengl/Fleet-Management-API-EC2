package com.fleetmanagement.api_rest.utils.mapper;

import com.fleetmanagement.api_rest.persistence.entity.RoleEntity;
import com.fleetmanagement.api_rest.persistence.entity.RoleEnum;
import com.fleetmanagement.api_rest.persistence.entity.UserEntity;
import com.fleetmanagement.api_rest.presentation.dto.UserCreateDTO;
import com.fleetmanagement.api_rest.presentation.dto.UserResponseDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-08T17:16:26-0500",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 21.0.4 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserResponseDTO toUserResponseDTO(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserResponseDTO.UserResponseDTOBuilder userResponseDTO = UserResponseDTO.builder();

        userResponseDTO.id( userEntity.getId() );
        userResponseDTO.name( userEntity.getName() );
        userResponseDTO.email( userEntity.getEmail() );

        return userResponseDTO.build();
    }

    @Override
    public UserEntity toUser(UserCreateDTO userCreateDTO) {
        if ( userCreateDTO == null ) {
            return null;
        }

        UserEntity.UserEntityBuilder userEntity = UserEntity.builder();

        userEntity.name( userCreateDTO.getName() );
        userEntity.email( userCreateDTO.getEmail() );
        userEntity.password( userCreateDTO.getPassword() );
        userEntity.accountNonExpired( userCreateDTO.isAccountNonExpired() );
        userEntity.accountNonLocked( userCreateDTO.isAccountNonLocked() );
        userEntity.credentialsNonExpired( userCreateDTO.isCredentialsNonExpired() );
        userEntity.role( roleEnumToRoleEntity( userCreateDTO.getRole() ) );

        return userEntity.build();
    }

    protected RoleEntity roleEnumToRoleEntity(RoleEnum roleEnum) {
        if ( roleEnum == null ) {
            return null;
        }

        RoleEntity.RoleEntityBuilder roleEntity = RoleEntity.builder();

        roleEntity.roleEnum( roleEnum );

        return roleEntity.build();
    }
}
