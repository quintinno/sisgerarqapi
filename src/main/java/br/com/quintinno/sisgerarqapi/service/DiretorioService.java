package br.com.quintinno.sisgerarqapi.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.quintinno.sisgerarqapi.model.DiretorioModel;
import br.com.quintinno.sisgerarqapi.repository.DiretorioImplementacaoRepository;
import br.com.quintinno.sisgerarqapi.repository.DiretorioRepository;

@Service
public class DiretorioService {

	@Autowired
	private DiretorioRepository diretorioRepository;
	
	@Autowired
	private DiretorioImplementacaoRepository diretorioImplementacaoRepository;
	
	public DiretorioModel saveOne(DiretorioModel diretorioModel) {
		if (this.isDiretorioDuplicado(diretorioModel)) {
			diretorioModel = this.diretorioRepository.save(this.configurarDiretorioPersistencia(diretorioModel));
		}
		return diretorioModel;
	}
	
	public List<DiretorioModel> saveAll(List<DiretorioModel> diretorioModelList) {
		return this.diretorioRepository.saveAll(diretorioModelList);
	}

	public List<DiretorioModel> findAll() {
		return this.diretorioRepository.findAll();
	}

	private DiretorioModel configurarDiretorioPersistencia(DiretorioModel diretorioModel) {
			diretorioModel.setTamanho(0);
			diretorioModel.setDataCriacao(new Date());
			diretorioModel.setDataModificacao(new Date());
			diretorioModel.seteAtivo(true);
		return diretorioModel;
	}

	private Boolean isDiretorioDuplicado(DiretorioModel diretorioModel) {
		return this.diretorioImplementacaoRepository.verificarDiretorioDuplicado(diretorioModel.getDiretorioPai(), diretorioModel.getNome());
//		return true;
	}
	
}
