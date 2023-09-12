package com.asesinatos.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asesinatos.backend.models.Familia;
import com.asesinatos.backend.services.familia.IFamiliaService;

@Controller
@RequestMapping("/familias")
public class FamiliaController {
    @Autowired
    private IFamiliaService fs;

    @GetMapping("/")
    public List<Familia> findAll(){
        return fs.findAll();
    }

    @GetMapping("/{id}")
    public Familia findById(@PathVariable Long id){
        return fs.findById(id);
    }

    @PostMapping("/")
    public Familia saveFamilia(@RequestBody Familia familia){
        System.out.println("Se llama la ruta");
        // return fs.save(familia);
        return familia;
    }
}
