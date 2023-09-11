package com.asesinatos.backend.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
    
    @OneToOne(cascade = CascadeType.ALL)
    //@OneToOne(mappedBy = "asesinado_id",fetch = FetchType.LAZY)//no me preguntes que no se
    @JoinColumn(name = "asesinado_id")
    private Persona asesinado_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "asesino_id")
    private Persona asesino_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "forma_asesinato_id")
    private FormaAsesinato forma_id;
}
