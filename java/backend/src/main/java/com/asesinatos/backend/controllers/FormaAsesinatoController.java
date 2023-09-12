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

import com.asesinatos.backend.models.FormaAsesinato;
import com.asesinatos.backend.services.forma_asesinato.IFormaAsesinatoService;

@RestController
@RequestMapping("/formasAsesinatos")
public class FormaAsesinatoController {
    @Autowired
    private IFormaAsesinatoService fas;

    @GetMapping("/list")
    public List<FormaAsesinato> findAll(){
        return fas.findAll();
    }

    @GetMapping("/list/{id}")
    public FormaAsesinato findById(@PathVariable Long id){
        return fas.findById(id);
    }

    @PostMapping("/save")
    public FormaAsesinato saveFamilia(@RequestBody() FormaAsesinato formaAsesinato){
        return fas.save(formaAsesinato);
    }

    @PutMapping("/update/{id}")
    public FormaAsesinato updateFormaAsesinato(@PathVariable Long id, @RequestBody FormaAsesinato formaAsesinato){
        return fas.updateFormaAsesinato(id, formaAsesinato);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFormaAsesinato(@PathVariable Long id){
        fas.deleteById(id);
    }
}
