package com.example.blockchain.mapper;

import com.example.blockchain.dto.request.DocumentoRequest;
import com.example.blockchain.dto.request.TipoTramiteRequest;
import com.example.blockchain.dto.response.DocumentoResponse;
import com.example.blockchain.dto.response.TipoTramiteResponse;
import com.example.blockchain.entity.Documento;
import com.example.blockchain.entity.TipoTramite;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")

public interface TipoTramiteMapper {    TipoTramite dtoToEntity(TipoTramiteRequest documentoRequest);

    TipoTramiteResponse entityToDTO(TipoTramite tipoTramite);
    List<TipoTramiteResponse> entityToDTOList(List<TipoTramite> tipoTramiteList);

}
