package com.asesinatos.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asesinatos.backend.models.Persona;

public interface IPersonaDAO extends JpaRepository<Persona, Long> {

}
