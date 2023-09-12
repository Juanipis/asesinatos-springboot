package com.asesinatos.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asesinatos.backend.models.FormaAsesinato;
import com.asesinatos.backend.services.forma_asesinato.IFormaAsesinatoService;

@Controller
@RequestMapping("/formasAsesinatos")
public class FormaAsesinatoController {
    @Autowired
    private IFormaAsesinatoService fas;

    @GetMapping("/")
    public List<FormaAsesinato> findAll(){
        return fas.findAll();
    }

    @GetMapping("/{id}")
    public FormaAsesinato findById(@PathVariable Long id){
        return fas.findById(id);
    }

    @PostMapping("/")
    public FormaAsesinato saveFamilia(@RequestBody() FormaAsesinato formaAsesinato){
        return fas.save(formaAsesinato);
    }
}
