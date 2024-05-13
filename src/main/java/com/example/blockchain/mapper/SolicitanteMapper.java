package com.example.blockchain.mapper;

import com.example.blockchain.dto.request.DocumentoRequest;
import com.example.blockchain.dto.request.SolicitanteRequest;
import com.example.blockchain.dto.response.DocumentoResponse;
import com.example.blockchain.dto.response.SolicitanteResponse;
import com.example.blockchain.entity.Documento;
import com.example.blockchain.entity.Solicitante;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface SolicitanteMapper {
    Solicitante dtoToEntity(SolicitanteRequest documentoRequest);

    SolicitanteResponse entityToDTO(Solicitante documento);
}
