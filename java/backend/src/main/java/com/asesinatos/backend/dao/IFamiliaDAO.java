package com.asesinatos.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asesinatos.backend.models.Familia;
import java.util.List;


public interface IFamiliaDAO extends JpaRepository<Familia, Long> {
    List<Familia> findByApellidos(String apellidos);
}
