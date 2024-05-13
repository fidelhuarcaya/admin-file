package com.example.blockchain.service.solicitante;

import com.example.blockchain.dto.request.SolicitanteRequest;
import com.example.blockchain.dto.request.SolicitudRequest;
import com.example.blockchain.dto.response.SolicitanteResponse;
import com.example.blockchain.dto.response.SolicitudResponse;

public interface SolicitanteService {

    SolicitanteResponse crearSolicitante(SolicitanteRequest solicitanteRequest);

}
