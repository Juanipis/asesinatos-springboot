package com.asesinatos.backend.services.forma_asesinato;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asesinatos.backend.dao.IFormaAsesinatoDAO;
import com.asesinatos.backend.models.FormaAsesinato;

@Service
public class FormaAsesinatoService implements IFormaAsesinatoService {
    @Autowired
    private IFormaAsesinatoDAO formaAsesinatoDAO;

    @Override
    public List<FormaAsesinato> findAll() {
        return formaAsesinatoDAO.findAll();
    }

    @Override
    public FormaAsesinato findById(Long id) {
        return formaAsesinatoDAO.findById(id).orElse(null);
    }

    @Override
    public FormaAsesinato save(FormaAsesinato formaAsesinato) {
        return formaAsesinatoDAO.save(formaAsesinato);
    }

    @Override
    public FormaAsesinato updateFormaAsesinato(Long id, FormaAsesinato formaAsesinato) {
        FormaAsesinato toUpdate = formaAsesinatoDAO.findById(id).orElse(null);
        if (toUpdate != null){
            toUpdate.setForma(formaAsesinato.getForma());
            formaAsesinatoDAO.save(toUpdate);
        }
        return toUpdate;
    }

    @Override
    public void deleteById(Long id) {
        formaAsesinatoDAO.deleteById(id);
    }
}
