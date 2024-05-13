package com.example.blockchain.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import com.example.blockchain.entity.abstracs.Auditable;

@Entity
@Setter
@Getter
@Table
public class Documento extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String contenido;
    private String hash;

    @Column(name = "estado")
    private Integer estado = 1;


}
