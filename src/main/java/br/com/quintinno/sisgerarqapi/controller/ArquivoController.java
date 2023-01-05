package br.com.quintinno.sisgerarqapi.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import br.com.quintinno.sisgerarqapi.dto.ResponseExceptionDTO;
import br.com.quintinno.sisgerarqapi.service.ArquivoService;

@RestController
@RequestMapping("/api/v1/arquivo")
public class ArquivoController {
	
	@Autowired
	private ArquivoService arquivoService;
	
	@PostMapping
	public ResponseExceptionDTO uploadOne(@RequestParam("arquivo") MultipartFile multipartFile) throws IOException {
		this.arquivoService.uploadOne(multipartFile);
		return new ResponseExceptionDTO("Arquivo Recepcionado com Sucesso!", HttpStatus.OK.name() );
	}

}
