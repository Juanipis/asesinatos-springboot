package com.asesinatos.backend.services.victima;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asesinatos.backend.dao.IVictimaDAO;
import com.asesinatos.backend.models.Familia;
import com.asesinatos.backend.models.Victima;

@Service
public class VictimaService implements IVictimaService {
    @Autowired
    private IVictimaDAO victimaDAO;

    @Override
    public List<Victima> findAll() {
        return victimaDAO.findAll();
    }

    @Override
    public Victima findById(Long id) {
        return victimaDAO.findById(id).orElse(null);
    }

    @Override
    public List<Victima> findByFamiliaId(Long familia_id) {
        return victimaDAO.findByFamiliaId(familia_id);
    }

    @Override
    public List<Victima> findByFormaAsesinatoId(Long formaAsesinato_id) {
        return victimaDAO.findByFormaAsesinatoId(formaAsesinato_id);
    }

    @Override
    public List<Victima> findByLugar(String lugar) {
        return victimaDAO.findByLugar(lugar);
    }

    @Override
    public List<Victima> findBynombre(String nombre) {
        return victimaDAO.findByNombre(nombre); 
    }

    @Override
    public Victima saveVictima(Victima victima) {
        return victimaDAO.save(victima);
    }

    @Override
    public Victima updateVictima(Long id, Victima victima){
        Victima toUpdate = victimaDAO.findById(id).orElse(null);
        if (toUpdate != null){
            toUpdate.setNombre(victima.getNombre());
            toUpdate.setLugar(victima.getLugar());
            victimaDAO.save(toUpdate);
        }
        return toUpdate;
    }

    @Override
    public void deleteById(Long id) {
        victimaDAO.deleteById(id);
    }

}
