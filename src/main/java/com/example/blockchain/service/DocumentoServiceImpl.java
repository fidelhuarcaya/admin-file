package com.example.blockchain.service;

import com.example.blockchain.dto.request.DocumentoRequest;
import com.example.blockchain.dto.response.DocumentoResponse;
import com.example.blockchain.mapper.DocumentoMapper;
import com.example.blockchain.repository.DocumentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DocumentoServiceImpl implements DocumentoService{
    private final DocumentoMapper documentoMapper;
    private final DocumentoRepository documentoRepository;
    @Override
    public DocumentoResponse crearDocumento(DocumentoRequest documentoRequest) {
        return documentoMapper.entityToDTO(
                documentoRepository.save(documentoMapper.dtoToEntity(documentoRequest))
        );
    }

    @Override
    public List<DocumentoResponse> buscarTodos() {
        return documentoRepository.findAll().stream().map(documentoMapper::entityToDTO).toList();
    }
}
