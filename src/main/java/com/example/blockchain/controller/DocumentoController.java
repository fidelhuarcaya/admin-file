package com.example.blockchain.controller;

import com.example.blockchain.dto.request.DocumentoRequest;
import com.example.blockchain.dto.response.DocumentoResponse;
import com.example.blockchain.entity.Documento;
import com.example.blockchain.repository.DocumentoRepository;
import com.example.blockchain.service.DocumentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/documentos")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class DocumentoController {

private final DocumentoService documentoService;


    @PostMapping
    public DocumentoResponse crearDocumento(@ModelAttribute DocumentoRequest documento) {
        System.out.println(documento);
        String hash = calcularHash(Objects.requireNonNull(documento.getFile().getOriginalFilename()));
        documento.setHash(hash);
        documento.setNombre(Objects.requireNonNull(documento.getFile().getOriginalFilename()));
        return documentoService.crearDocumento(documento);
    }

    @GetMapping
    public List<DocumentoResponse> obtenerDocumentos() {
        return documentoService.buscarTodos();
    }

    // Método para calcular el hash utilizando SHA-256
    private String calcularHash(String contenido) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(contenido.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte hashByte : hashBytes) {
                String hex = Integer.toHexString(0xff & hashByte);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
