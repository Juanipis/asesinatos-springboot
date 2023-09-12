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

import com.asesinatos.backend.models.Familia;
import com.asesinatos.backend.services.familia.IFamiliaService;

@RestController
@RequestMapping("/familias")
public class FamiliaController {
    @Autowired
    private IFamiliaService fs;

    @GetMapping("/list")
    public List<Familia> findAll(){
        return fs.findAll();
    }

    @GetMapping("/list/id/{id}")
    public Familia findById(@PathVariable Long id){
        return fs.findById(id);
    }

    @GetMapping("/list/apellidos/{apellido}")
    public List<Familia> findByApellido(@PathVariable String apellido){
        return fs.findByApellido(apellido);
    }

    @PostMapping("/save")
    public Familia saveFamilia(@RequestBody Familia familia){
        return fs.save(familia);
    }

    @PutMapping("/update/{id}")
    public Familia saveFamilia(@PathVariable Long id, @RequestBody Familia familia){
        return fs.updateFamilia(id, familia);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFamilia(@PathVariable Long id){
        fs.deleteById(id);
    }
}
