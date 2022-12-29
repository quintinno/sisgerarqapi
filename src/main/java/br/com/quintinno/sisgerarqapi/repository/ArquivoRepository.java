package br.com.quintinno.sisgerarqapi.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.quintinno.sisgerarqapi.model.ArquivoModel;

public interface ArquivoRepository extends JpaRepository<ArquivoModel, UUID> { }
