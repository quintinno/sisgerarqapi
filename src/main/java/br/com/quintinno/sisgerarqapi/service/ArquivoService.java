package br.com.quintinno.sisgerarqapi.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

import br.com.quintinno.sisgerarqapi.repository.DiretorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.com.quintinno.sisgerarqapi.model.ArquivoModel;
import br.com.quintinno.sisgerarqapi.repository.ArquivoRepository;

@Service
public class ArquivoService {

	@Autowired
	private ArquivoRepository arquivoRepository;

	@Autowired
	private DiretorioRepository diretorioRepository;

	public ArquivoModel saveOne(ArquivoModel arquivoModel) {
		return this.arquivoRepository.save(arquivoModel);
	}
	
	public ArquivoModel uploadOne(Long sistemaOrigem, MultipartFile multipartFile) throws IOException {
		ArquivoModel arquivoModel = new ArquivoModel();
		if (sistemaOrigem != null) {
			arquivoModel = new ArquivoModel(multipartFile.getOriginalFilename(), multipartFile.getSize(), multipartFile.getContentType());
			arquivoModel.setDiretorioModel(this.diretorioRepository.findByCodigo(sistemaOrigem));
			this.gravarArquivoDiretorio(arquivoModel.getDiretorioModel().getNome(), multipartFile);
		}
		return this.arquivoRepository.saveAndFlush(arquivoModel);
	}
	
	private void gravarArquivoDiretorio(String nomeDiretorio, MultipartFile multipartFile) throws IOException {
		String caminhoDiretorio = this.gerarCaminhoDiretorio().concat(File.separator).concat(nomeDiretorio).concat(File.separator);
		verificarDiretorioExistente(caminhoDiretorio);
		Path path = Paths.get(caminhoDiretorio, multipartFile.getOriginalFilename()).toAbsolutePath().normalize();
		Files.copy(multipartFile.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
	}

	private static void verificarDiretorioExistente(String caminhoDiretorio) {
		if (!new File(caminhoDiretorio).exists()) {
			new File(caminhoDiretorio).mkdir();
		}
	}

	private String gerarCaminhoDiretorio() {
		StringBuilder diretorio = new StringBuilder(System.getProperty("user.dir"))
				.append(File.separator).append("src").append(File.separator).append("main")
				.append(File.separator).append("resources").append(File.separator).append("repository");
		return diretorio.toString();
	}
	
}
