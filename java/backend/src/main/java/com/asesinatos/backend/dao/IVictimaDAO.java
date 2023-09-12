package com.asesinatos.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asesinatos.backend.models.Victima;
import java.util.List;


public interface IVictimaDAO extends JpaRepository<Victima, Long> {
    List<Victima> findByFamiliaId(Long familia_id);

    List<Victima> findByFormaAsesinatoId(Long formaAsesinato_id);

    List<Victima> findByLugar(String lugar);

    List<Victima> findByNombre(String nombre);
}
