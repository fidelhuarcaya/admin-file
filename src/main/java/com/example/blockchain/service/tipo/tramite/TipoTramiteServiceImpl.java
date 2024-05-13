package com.example.blockchain.service.tipo.tramite;

import com.example.blockchain.dto.response.TipoTramiteResponse;
import com.example.blockchain.mapper.TipoTramiteMapper;
import com.example.blockchain.repository.TipoTramiteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class TipoTramiteServiceImpl implements TipoTramiteService{

    private final TipoTramiteRepository tipoTramiteRepository;
    private final TipoTramiteMapper tipoTramiteMapper;

    @Override
    public List<TipoTramiteResponse> buscarTodos() {
        return tipoTramiteMapper.entityToDTOList(tipoTramiteRepository.findAll());
    }
}
