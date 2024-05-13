package com.example.blockchain.service.solicitante;

import com.example.blockchain.dto.request.SolicitanteRequest;
import com.example.blockchain.dto.response.SolicitanteResponse;
import com.example.blockchain.mapper.SolicitanteMapper;
import com.example.blockchain.repository.SolicitanteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SolicitanteServiceImpl implements SolicitanteService{
    private final SolicitanteRepository solicitanteRepository;
    private final SolicitanteMapper solicitanteMapper;
    @Override
    public SolicitanteResponse crearSolicitante(SolicitanteRequest solicitanteRequest) {
        return solicitanteMapper.entityToDTO(solicitanteRepository.save(
                solicitanteMapper.dtoToEntity(solicitanteRequest)));
    }
}
