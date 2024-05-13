package com.example.blockchain.controller;

import com.example.blockchain.dto.request.DocumentoRequest;
import com.example.blockchain.dto.request.SolicitudRequest;
import com.example.blockchain.dto.response.DocumentoResponse;
import com.example.blockchain.dto.response.SolicitudResponse;
import com.example.blockchain.service.DocumentoService;
import com.example.blockchain.service.solicitud.SolicitudService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/api/solicitudes")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class SolicitudController {
    private final SolicitudService solicitudService;

    @PostMapping
    public SolicitudResponse crearDocumento(@ModelAttribute SolicitudRequest solicitudRequest) {
        return solicitudService.crearSolicitud(solicitudRequest);
    }
}
