package com.asesinatos.backend.services.persona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asesinatos.backend.dao.IPersonaDAO;
import com.asesinatos.backend.models.Persona;

@Service
public class PersonaService implements IPersonaService {
    @Autowired
    private IPersonaDAO personaDao;

    @Override
    public List<Persona> findAll() {
        return personaDao.findAll();
    }

    @Override
    public Persona findById(Long id) {
        return personaDao.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        personaDao.deleteById(id);
    }

    @Override
    public Persona save(Persona persona) {
        return personaDao.save(persona);
    }

}
