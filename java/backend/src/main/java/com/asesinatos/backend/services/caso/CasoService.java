package com.asesinatos.backend.services.caso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asesinatos.backend.dao.ICasosDAO;
import com.asesinatos.backend.models.Caso;

@Service
public class CasoService implements ICasoService{
    @Autowired
    private ICasosDAO casoDao;

    @Override
    public List<Caso> findAll() {
         return casoDao.findAll();
    }

    @Override
    public Caso findById(Long id) {
        
        return casoDao.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {

        casoDao.deleteById(id);
    }

    @Override
    public Caso save(Caso caso) {
         return casoDao.save(caso);
    }
    
}
