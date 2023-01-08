package br.com.quintinno.sisgerarqapi.controller;

import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import br.com.quintinno.sisgerarqapi.dto.ResponseExceptionDTO;
import br.com.quintinno.sisgerarqapi.service.ArquivoService;

@RestController
@RequestMapping("/api/v1/arquivo")
public class ArquivoController {
	
	@Autowired
	private ArquivoService arquivoService;
	
	@PostMapping("/{sistema-origem}")
	public ResponseExceptionDTO uploadOne(@PathVariable("sistema-origem") Long sistemaOrigem, @RequestParam("arquivo") MultipartFile multipartFile) throws IOException {
		this.arquivoService.uploadOne(sistemaOrigem, multipartFile);
		return new ResponseExceptionDTO("Arquivo Recepcionado com Sucesso!", HttpStatus.OK.name() );
	}

}
