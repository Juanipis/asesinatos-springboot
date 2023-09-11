package com.asesinatos.backend.services.caso;
import java.util.List;
import com.asesinatos.backend.models.Caso;

public interface ICasoService {
     public List<Caso> findAll();

    public Caso findById(Long id);

    public void deleteById(Long id);

    public Caso save(Caso caso); 
}

