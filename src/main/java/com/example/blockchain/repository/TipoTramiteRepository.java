package com.example.blockchain.repository;

import com.example.blockchain.entity.TipoTramite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoTramiteRepository extends JpaRepository<TipoTramite, Long> {
}
