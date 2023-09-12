package com.asesinatos.backend.services.forma_asesinato;

import java.util.List;
import com.asesinatos.backend.models.FormaAsesinato;

public interface IFormaAsesinatoService {
    public List<FormaAsesinato> findAll();

    public FormaAsesinato findById(Long id);

    public FormaAsesinato save(FormaAsesinato formaAsesinato);

    public FormaAsesinato updateFormaAsesinato(Long id, FormaAsesinato formaAsesinato);

    public void deleteById(Long id);
}
