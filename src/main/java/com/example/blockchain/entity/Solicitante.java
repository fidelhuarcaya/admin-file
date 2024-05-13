package com.example.blockchain.entity;

import com.example.blockchain.entity.abstracs.Auditable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table
public class Solicitante extends Auditable {
    @GeneratedValue
    @Id
    private Integer idSolicitante;
    private String nombres;
    private String apellidos;
    private String dni;

}
