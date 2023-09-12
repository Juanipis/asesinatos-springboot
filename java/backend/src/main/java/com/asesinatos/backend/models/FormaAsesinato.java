package com.asesinatos.backend.models;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "formas_asesinatos")
public class FormaAsesinato implements Comparable<FormaAsesinato>, Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Column
    @Getter
    @Setter
    private String forma;

    @Column
    @OneToMany()
    private List<Victima> victimas;

    @Override
    public int compareTo(FormaAsesinato arg0) {
        return this.getForma().compareTo(arg0.getForma());
    }
}
