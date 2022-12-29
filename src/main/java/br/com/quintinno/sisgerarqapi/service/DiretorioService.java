package br.com.quintinno.sisgerarqapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.quintinno.sisgerarqapi.model.DiretorioModel;
import br.com.quintinno.sisgerarqapi.repository.DiretorioRepository;

@Service
public class DiretorioService {

	@Autowired
	private DiretorioRepository diretorioRepository;
	
	public DiretorioModel saveOne(DiretorioModel diretorioModel) {
		return this.diretorioRepository.save(diretorioModel);
	}
	
	public List<DiretorioModel> saveAll(List<DiretorioModel> diretorioModelList) {
		return this.diretorioRepository.saveAll(diretorioModelList);
	}
	
}
