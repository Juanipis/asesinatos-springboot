package com.asesinatos.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "caso")
public class Caso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Column
    @Getter
    @Setter
    private String lugar;
    /*
     * De persona: asesinado_id y asesino_id
     * De Forma: forma_id
     * De lugar: string lugar
     * 
     */
    
     @OneToMany
     @JoinColumn(name = "persona_id")
     private Persona asesinado_id;

     @OneToMany
     @JoinColumn(name = "persona_id")
     private Persona asesino_id;

      @OneToMany
     @JoinColumn(name = "forma_asesinato_id")
     private FormaAsesinato forma_id;
}
