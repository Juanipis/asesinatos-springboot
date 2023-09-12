package com.asesinatos.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asesinatos.backend.models.FormaAsesinato;

public interface IFormaAsesinatoDAO extends JpaRepository<FormaAsesinato, Long> {
    
}
