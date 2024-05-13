package com.example.blockchain.service.tipo.tramite;

import com.example.blockchain.dto.response.DocumentoResponse;
import com.example.blockchain.dto.response.TipoTramiteResponse;

import java.util.List;

public interface TipoTramiteService {
    List<TipoTramiteResponse> buscarTodos();

}
