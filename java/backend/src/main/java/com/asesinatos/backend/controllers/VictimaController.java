package com.asesinatos.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asesinatos.backend.models.Victima;
import com.asesinatos.backend.services.victima.IVictimaService;

@RestController
@RequestMapping("/victimas")
public class VictimaController {
    @Autowired
    private IVictimaService vs;

    @GetMapping("/list")
    public List<Victima> findAll(){
        return vs.findAll();
    }

    @GetMapping("/list/id/{id}")
    public Victima findById(@PathVariable Long id){
        return vs.findById(id);
    }
    
    @GetMapping("/list/familia/{familia_id}")
    public List<Victima> findByFamiliaId(@PathVariable Long familia_id){
        return vs.findByFamiliaId(familia_id);
    }

    @GetMapping("/list/formaAsesinato/{formaAsesinato_id}")
    public List<Victima> findByFormaAsesinatoId(@PathVariable Long formaAsesinato_id){
        return vs.findByFormaAsesinatoId(formaAsesinato_id);
    }

    @GetMapping("/list/lugar/{lugar}")
    public List<Victima> findByLugar(@PathVariable String lugar){
        return vs.findByLugar(lugar);
    }

    @GetMapping("/list/nombre/{nombre}")
    public List<Victima> findByNombre(@PathVariable String nombre){
        return vs.findBynombre(nombre);
    }

    @PostMapping("/save")
    public Victima saveVictima(@RequestBody Victima persona){
        return vs.saveVictima(persona);
    }

    @PutMapping("/update/{id}")
    public Victima updateVictima(@PathVariable Long id, @RequestBody Victima victima){
        return vs.updateVictima(id, victima);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteVictima(@PathVariable Long id){
        vs.deleteById(id);
    }
}
