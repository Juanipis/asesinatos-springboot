package com.asesinatos.backend.services.familia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asesinatos.backend.dao.IFamiliaDAO;
import com.asesinatos.backend.models.Familia;

@Service
public class FamiliaService implements IFamiliaService {
    @Autowired
    private IFamiliaDAO familiaDAO;

    @Override
    public List<Familia> findAll() {
        return familiaDAO.findAll();
    }

    @Override
    public Familia findById(Long id) {
        return familiaDAO.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        familiaDAO.deleteById(id);
    }

    @Override
    public Familia save(Familia familia) {
        System.out.println("Se llama al servicio");
        return familiaDAO.save(familia);
    }

}
