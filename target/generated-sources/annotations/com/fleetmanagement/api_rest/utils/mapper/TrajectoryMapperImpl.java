package com.fleetmanagement.api_rest.utils.mapper;

import com.fleetmanagement.api_rest.persistence.entity.TaxiEntity;
import com.fleetmanagement.api_rest.persistence.entity.TrajectoryEntity;
import com.fleetmanagement.api_rest.presentation.dto.TrajectoryDTO;
import java.text.SimpleDateFormat;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-08T16:56:35-0500",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 3.40.0.v20240919-1711, environment: Java 17.0.12 (Eclipse Adoptium)"
)
@Component
public class TrajectoryMapperImpl implements TrajectoryMapper {

    @Override
    public TrajectoryDTO toTrajectoryDTO(TrajectoryEntity trajectoryEntity) {
        if ( trajectoryEntity == null ) {
            return null;
        }

        TrajectoryDTO.TrajectoryDTOBuilder trajectoryDTO = TrajectoryDTO.builder();

        trajectoryDTO.taxiId( trajectoryEntityTaxiIdId( trajectoryEntity ) );
        trajectoryDTO.plate( trajectoryEntityTaxiIdPlate( trajectoryEntity ) );
        if ( trajectoryEntity.getDate() != null ) {
            trajectoryDTO.date( new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" ).format( trajectoryEntity.getDate() ) );
        }
        trajectoryDTO.id( trajectoryEntity.getId() );
        trajectoryDTO.latitude( trajectoryEntity.getLatitude() );
        trajectoryDTO.longitude( trajectoryEntity.getLongitude() );

        return trajectoryDTO.build();
    }

    private Integer trajectoryEntityTaxiIdId(TrajectoryEntity trajectoryEntity) {
        if ( trajectoryEntity == null ) {
            return null;
        }
        TaxiEntity taxiId = trajectoryEntity.getTaxiId();
        if ( taxiId == null ) {
            return null;
        }
        Integer id = taxiId.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String trajectoryEntityTaxiIdPlate(TrajectoryEntity trajectoryEntity) {
        if ( trajectoryEntity == null ) {
            return null;
        }
        TaxiEntity taxiId = trajectoryEntity.getTaxiId();
        if ( taxiId == null ) {
            return null;
        }
        String plate = taxiId.getPlate();
        if ( plate == null ) {
            return null;
        }
        return plate;
    }
}
