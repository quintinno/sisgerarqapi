package br.com.quintinno.sisgerarqapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.quintinno.sisgerarqapi.dto.ResponseExceptionDTO;

@ControllerAdvice
public class ResponseException extends ResponseEntityExceptionHandler {
	
	public static final String DIRETORIO_DUPLICADO = "Já existe um diretório com o mesmo nome!";
	
	@ExceptionHandler(DiretorioDuplicadoException.class)
	public ResponseEntity<ResponseExceptionDTO> exception(DiretorioDuplicadoException diretorioDuplicadoException) {
		return ResponseEntity.status(HttpStatus.CONFLICT).body(new ResponseExceptionDTO(DIRETORIO_DUPLICADO, HttpStatus.CONFLICT.name()));
	}

}
