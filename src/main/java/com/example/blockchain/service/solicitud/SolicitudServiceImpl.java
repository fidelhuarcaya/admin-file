package com.example.blockchain.service.solicitud;

import com.example.blockchain.dto.request.SolicitanteRequest;
import com.example.blockchain.dto.request.SolicitudRequest;
import com.example.blockchain.dto.response.SolicitudResponse;
import com.example.blockchain.mapper.SolicitudMapper;
import com.example.blockchain.repository.SolicitudRepository;
import com.example.blockchain.service.solicitante.SolicitanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SolicitudServiceImpl implements SolicitudService {
    private final SolicitudRepository solicitudRepository;
    private final SolicitudMapper solicitudMapper;
    private final SolicitanteService solicitanteService;
    @Override
    public SolicitudResponse crearSolicitud(SolicitudRequest solicitudRequest) {
        solicitanteService.crearSolicitante(
                SolicitanteRequest.builder()
                        .dni(solicitudRequest.getDni())
                        .nombres(solicitudRequest.getNombres())
                        .apellidos(solicitudRequest.getApellidos())
                        .build());
        return solicitudMapper.entityToDTO(
                solicitudRepository.save(solicitudMapper.dtoToEntity(solicitudRequest)));
    }
}
