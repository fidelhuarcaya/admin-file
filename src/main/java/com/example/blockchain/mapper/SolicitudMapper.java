package com.example.blockchain.mapper;

import com.example.blockchain.dto.request.DocumentoRequest;
import com.example.blockchain.dto.request.SolicitudRequest;
import com.example.blockchain.dto.response.DocumentoResponse;
import com.example.blockchain.dto.response.SolicitudResponse;
import com.example.blockchain.entity.Documento;
import com.example.blockchain.entity.Solicitud;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface SolicitudMapper {
    Solicitud dtoToEntity(SolicitudRequest solicitudRequest);

    SolicitudResponse entityToDTO(Solicitud solicitud);
}
