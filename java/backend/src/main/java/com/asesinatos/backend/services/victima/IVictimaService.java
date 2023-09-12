package com.asesinatos.backend.services.victima;

import java.util.List;

import com.asesinatos.backend.models.Victima;

public interface IVictimaService {
    public List<Victima> findAll();

    public Victima findById(Long id);

    public void deleteById(Long id);

    public Victima save(Victima persona);
}
