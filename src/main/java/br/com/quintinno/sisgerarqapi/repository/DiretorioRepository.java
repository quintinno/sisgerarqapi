package br.com.quintinno.sisgerarqapi.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.quintinno.sisgerarqapi.model.DiretorioModel;

@Repository
public interface DiretorioRepository extends JpaRepository<DiretorioModel, UUID> { }
