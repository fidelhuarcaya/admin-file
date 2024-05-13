package com.example.blockchain.dto.response;

import lombok.Data;

@Data
public class SolicitudResponse {
    private String nombres;
    private String apellidos;
    private String dni;
    private Integer idTipoTramite;
}
