package com.asesinatos.backend.services.victima;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asesinatos.backend.dao.IVictimaDAO;
import com.asesinatos.backend.models.Victima;

@Service
public class VictimaService implements IVictimaService {
    @Autowired
    private IVictimaDAO victimaDao;

    @Override
    public List<Victima> findAll() {
        return victimaDao.findAll();
    }

    @Override
    public Victima findById(Long id) {
        return victimaDao.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        victimaDao.deleteById(id);
    }

    @Override
    public Victima save(Victima victima) {
        return victimaDao.save(victima);
    }

}
