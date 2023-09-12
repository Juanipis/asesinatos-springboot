package com.asesinatos.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asesinatos.backend.models.Victima;

public interface IVictimaDAO extends JpaRepository<Victima, Long> {

}
