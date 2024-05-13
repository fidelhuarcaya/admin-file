package com.example.blockchain.controller;

import com.example.blockchain.dto.request.DocumentoRequest;
import com.example.blockchain.dto.response.DocumentoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/solicitantes")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class SolicitanteController {

    @PostMapping
    public DocumentoResponse crearDocumento(@ModelAttribute DocumentoRequest documento) {

        return null;
    }

    @GetMapping
    public List<DocumentoResponse> obtenerDocumentos() {
        return List.of();
    }

}
