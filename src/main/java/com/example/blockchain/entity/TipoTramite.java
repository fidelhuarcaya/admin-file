package com.example.blockchain.entity;

import com.example.blockchain.entity.abstracs.Auditable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "TIPO_TRAMITE")
public class TipoTramite extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTipoTramite;
    private String nombre;
}
