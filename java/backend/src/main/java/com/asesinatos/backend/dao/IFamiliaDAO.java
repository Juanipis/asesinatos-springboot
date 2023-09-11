package com.asesinatos.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asesinatos.backend.models.Familia;

public interface IFamiliaDAO extends JpaRepository<Familia, Long> {

}
