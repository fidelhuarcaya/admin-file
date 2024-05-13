package com.example.blockchain.controller;

import com.example.blockchain.dto.request.DocumentoRequest;
import com.example.blockchain.dto.response.DocumentoResponse;
import com.example.blockchain.dto.response.TipoTramiteResponse;
import com.example.blockchain.entity.TipoTramite;
import com.example.blockchain.service.tipo.tramite.TipoTramiteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/tipos-tramites")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class TipoTramiteController {

private final TipoTramiteService tipoTramiteService;
    @GetMapping
    public List<TipoTramiteResponse> buscarTipoTramites() {
        return tipoTramiteService.buscarTodos();
    }

}
