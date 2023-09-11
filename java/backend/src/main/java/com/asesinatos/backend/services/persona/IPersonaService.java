package com.asesinatos.backend.services.persona;

import java.util.List;

import com.asesinatos.backend.models.Persona;

public interface IPersonaService {
    public List<Persona> findAll();

    public Persona findById(Long id);

    public void deleteById(Long id);

    public Persona save(Persona persona);
}
