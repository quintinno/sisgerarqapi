package br.com.quintinno.sisgerarqapi.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.com.quintinno.sisgerarqapi.model.ArquivoModel;
import br.com.quintinno.sisgerarqapi.repository.ArquivoRepository;

@Service
public class ArquivoService {

	@Autowired
	private ArquivoRepository arquivoRepository;
	
	public static final String DIRETORIO = System.getProperty("user.home").concat(File.separator).concat("SISGERARQRPS");
	
	public ArquivoModel saveOne(ArquivoModel arquivoModel) {
		return this.arquivoRepository.save(arquivoModel);
	}
	
	public ArquivoModel uploadOne(MultipartFile multipartFile) throws IOException {
		ArquivoModel arquivoModel = new ArquivoModel(multipartFile.getOriginalFilename(), multipartFile.getSize(), multipartFile.getContentType());
		this.gravarArquivoDiretorio(multipartFile);
		return this.arquivoRepository.saveAndFlush(arquivoModel);
	}
	
	private void gravarArquivoDiretorio(MultipartFile multipartFile) throws IOException {
		Path path = Paths.get(DIRETORIO, multipartFile.getOriginalFilename()).toAbsolutePath().normalize();
		Files.copy(multipartFile.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
	}
	
}
