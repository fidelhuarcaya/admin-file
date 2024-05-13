package com.example.blockchain.service;

import com.example.blockchain.dto.request.DocumentoRequest;
import com.example.blockchain.dto.response.DocumentoResponse;
import com.example.blockchain.entity.Documento;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

public interface DocumentoService {
    DocumentoResponse crearDocumento(DocumentoRequest documentoRequest);
    List<DocumentoResponse> buscarTodos();


}
