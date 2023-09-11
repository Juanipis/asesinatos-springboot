package com.asesinatos.backend.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.asesinatos.backend.models.Caso;

public interface ICasosDAO extends JpaRepository<Caso, Long>{
    
}

