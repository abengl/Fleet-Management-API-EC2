package com.fleetmanagement.api_rest.utils.mapper;

import com.fleetmanagement.api_rest.persistence.entity.TaxiEntity;
import com.fleetmanagement.api_rest.presentation.dto.TaxiDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-08T17:16:27-0500",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 21.0.4 (Oracle Corporation)"
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
