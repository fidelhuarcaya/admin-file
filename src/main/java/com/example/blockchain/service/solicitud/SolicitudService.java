package com.example.blockchain.service.solicitud;

import com.example.blockchain.dto.request.DocumentoRequest;
import com.example.blockchain.dto.request.SolicitudRequest;
import com.example.blockchain.dto.response.DocumentoResponse;
import com.example.blockchain.dto.response.SolicitudResponse;

public interface SolicitudService {
    SolicitudResponse crearSolicitud(SolicitudRequest solicitudRequest);
}
