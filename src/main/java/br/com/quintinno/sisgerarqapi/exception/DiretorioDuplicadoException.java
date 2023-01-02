package br.com.quintinno.sisgerarqapi.exception;

public class DiretorioDuplicadoException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public DiretorioDuplicadoException() { }
	
	public DiretorioDuplicadoException(String mensagem) {
		super(mensagem);
	}

}
