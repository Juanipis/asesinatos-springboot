package com.asesinatos.backend.services.familia;

import java.util.List;

import com.asesinatos.backend.models.Familia;

public interface IFamiliaService {
    public List<Familia> findAll();

    public Familia findById(Long id);

    public void deleteById(Long id);

    public Familia save(Familia familia);
}
