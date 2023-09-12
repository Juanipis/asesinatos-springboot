package com.asesinatos.backend.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "victimas")
public class Victima implements Comparable<Victima>, Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Column
    @Getter
    @Setter
    private String nombre;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "familia_id")
    @Getter
    @Setter
    private Familia familia;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "forma_asesinato_id")
    @Getter
    @Setter
    private FormaAsesinato formaAsesinato;

    @Column
    @Getter
    @Setter
    private String lugar;

    @Override
    public int compareTo(Victima arg0) {
        return this.getNombre().compareTo(arg0.getNombre());
    }
}
