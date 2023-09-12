package com.asesinatos.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asesinatos.backend.models.Victima;
import com.asesinatos.backend.services.victima.IVictimaService;

@Controller
@RequestMapping("/personas")
public class VictimaController {
    @Autowired
    private IVictimaService vs;

    @GetMapping("/list/{id}")
    public Victima listOne(@PathVariable Long id){
        return vs.findById(id);
    }

    @GetMapping("/list")
    public List<Victima> listAll(){
        return vs.findAll();
    }

    @PostMapping("/save")
    public Victima save(@RequestBody Victima persona){
        return vs.save(persona);
    }
}
