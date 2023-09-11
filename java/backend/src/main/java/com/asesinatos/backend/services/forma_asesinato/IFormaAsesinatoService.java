package com.asesinatos.backend.services.forma_asesinato;

import java.util.List;
import com.asesinatos.backend.models.FormaAsesinato;

public interface IFormaAsesinatoService {
    public List<FormaAsesinato> findAll();

    public FormaAsesinato findById(Long id);

    public void deleteById(Long id);

    public FormaAsesinato save(FormaAsesinato formaAsesinato);
}
