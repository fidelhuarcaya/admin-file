package com.example.blockchain.mapper;

import com.example.blockchain.dto.request.DocumentoRequest;
import com.example.blockchain.dto.response.DocumentoResponse;
import com.example.blockchain.entity.Documento;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DocumentoMapper {
    Documento dtoToEntity(DocumentoRequest documentoRequest);

    DocumentoResponse entityToDTO(Documento documento);
}
