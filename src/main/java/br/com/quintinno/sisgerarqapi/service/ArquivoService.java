package br.com.quintinno.sisgerarqapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.quintinno.sisgerarqapi.model.ArquivoModel;
import br.com.quintinno.sisgerarqapi.repository.ArquivoRepository;

@Service
public class ArquivoService {

	@Autowired
	private ArquivoRepository arquivoRepository;
	
	public ArquivoModel saveOne(ArquivoModel arquivoModel) {
		return this.arquivoRepository.save(arquivoModel);
	}
	
}
