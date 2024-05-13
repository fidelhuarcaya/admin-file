package com.example.blockchain.dto.response;

import lombok.Data;

@Data
public class SolicitanteResponse {
    private Long idSolicitante;
    private String nombres;
    private String apellidos;
    private String dni;

}
