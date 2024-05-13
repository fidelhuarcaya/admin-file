package com.example.blockchain.entity.abstracs;

import jakarta.persistence.Column;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
public abstract class Auditable {
    @Column(name = "fecha_adicion", updatable = false)
    @CreationTimestamp
    private LocalDateTime fechaAdicion;


    @Column(name = "fecha_modificacion")
    @UpdateTimestamp
    private LocalDateTime fechaModificacion;
}
