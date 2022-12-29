package br.com.quintinno.sisgerarqapi.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.quintinno.sisgerarqapi.model.DiretorioModel;

public interface DiretorioRepository extends JpaRepository<DiretorioModel, UUID> { }
