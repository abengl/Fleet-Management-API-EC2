package com.fleetmanagement.api_rest.utils.mapper;

import com.fleetmanagement.api_rest.persistence.entity.TaxiEntity;
import com.fleetmanagement.api_rest.presentation.dto.TaxiDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-08T16:56:35-0500",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 3.40.0.v20240919-1711, environment: Java 17.0.12 (Eclipse Adoptium)"
)
@Component
public class TaxiMapperImpl implements TaxiMapper {

    @Override
    public TaxiDTO toTaxiDTO(TaxiEntity taxiEntity) {
        if ( taxiEntity == null ) {
            return null;
        }

        TaxiDTO.TaxiDTOBuilder taxiDTO = TaxiDTO.builder();

        taxiDTO.id( taxiEntity.getId() );
        taxiDTO.plate( taxiEntity.getPlate() );

        return taxiDTO.build();
    }
}
