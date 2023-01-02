package br.com.quintinno.sisgerarqapi.dto;

import java.util.Date;

import br.com.quintinno.sisgerarqapi.utility.DataUtility;

public class ResponseExceptionDTO {
	
	private String data;

    private String mensagem;

    private String situacao;

    public ResponseExceptionDTO() { }

    public ResponseExceptionDTO(String mensagem, String situacao) {
        this.data = DataUtility.formatarData(new Date(), DataUtility.FORMATO_DATA_DDMMAAAA_HHMMSS);
        this.mensagem = mensagem;
        this.situacao = situacao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

}
