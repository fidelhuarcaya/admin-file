package com.example.blockchain.dto.request;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SolicitanteRequest {
    private String nombres;
    private String apellidos;
    private String dni;}
