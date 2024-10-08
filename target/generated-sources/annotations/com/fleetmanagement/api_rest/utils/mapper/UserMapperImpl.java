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
    date = "2024-10-08T16:56:35-0500",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 3.40.0.v20240919-1711, environment: Java 17.0.12 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserResponseDTO toUserResponseDTO(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserResponseDTO.UserResponseDTOBuilder userResponseDTO = UserResponseDTO.builder();

        userResponseDTO.email( userEntity.getEmail() );
        userResponseDTO.id( userEntity.getId() );
        userResponseDTO.name( userEntity.getName() );

        return userResponseDTO.build();
    }

    @Override
    public UserEntity toUser(UserCreateDTO userCreateDTO) {
        if ( userCreateDTO == null ) {
            return null;
        }

        UserEntity.UserEntityBuilder userEntity = UserEntity.builder();

        userEntity.accountNonExpired( userCreateDTO.isAccountNonExpired() );
        userEntity.accountNonLocked( userCreateDTO.isAccountNonLocked() );
        userEntity.credentialsNonExpired( userCreateDTO.isCredentialsNonExpired() );
        userEntity.email( userCreateDTO.getEmail() );
        userEntity.name( userCreateDTO.getName() );
        userEntity.password( userCreateDTO.getPassword() );
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
