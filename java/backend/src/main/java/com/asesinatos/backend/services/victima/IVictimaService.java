package com.asesinatos.backend.services.victima;

import java.util.List;

import com.asesinatos.backend.models.Victima;

public interface IVictimaService {
    public List<Victima> findAll();

    public Victima findById(Long id);

    public List<Victima> findByFamiliaId(Long familia_id);

    public List<Victima> findByFormaAsesinatoId(Long formaAsesinato_id);

    public List<Victima> findByLugar(String lugar);

    public List<Victima> findBynombre(String nombre);

    public Victima saveVictima(Victima victima);

    public Victima updateVictima(Long id, Victima victima);

    public void deleteById(Long id);

}
