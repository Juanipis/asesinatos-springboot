package com.asesinatos.backend.services.familia;

import java.util.List;

import com.asesinatos.backend.models.Familia;

public interface IFamiliaService {
    public List<Familia> findAll();

    public Familia findById(Long id);

    public List<Familia> findByApellido(String apellido);

    public Familia save(Familia familia);

    public Familia updateFamilia(Long id, Familia familia);

    public void deleteById(Long id);
}
