package com.example.blockchain.dto.request;

import jakarta.persistence.Column;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;

@Data
public class DocumentoRequest {
    private Long id;
    private String nombre;
    private String hash;

    private Integer estado = 1;
    private MultipartFile file;


}
