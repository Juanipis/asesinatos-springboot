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
@Table(name = "familias")
public class Familia implements Comparable<Familia>, Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Column
    @Getter
    @Setter
    private String apellidos;

    @Column
    @OneToMany()
    private List<Victima> victimas;

    @Override
    public int compareTo(Familia arg0) {
        return this.getApellidos().compareTo(arg0.getApellidos());
    }
}
