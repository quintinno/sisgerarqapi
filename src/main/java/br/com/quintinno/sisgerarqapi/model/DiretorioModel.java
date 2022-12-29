package br.com.quintinno.sisgerarqapi.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_DIRETORIO")
public class DiretorioModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CODIGO", nullable = false)
	private UUID codigo;
	
	@Column(name = "ID_DIRETORIO_PAI", nullable = false)
	private UUID diretorioPai;
	
	@Column(name = "ID_PESSOA", nullable = false)
	private UUID pessoa;
	
	@Column(name = "NOME", nullable = false)
	private String nome;
	
	@Column(name = "TAMANHO", nullable = false)
	private Integer tamanho;
	
	@Column(name = "DATA_CRIACAO", nullable = false)
	private Date dataCriacao;
	
	@Column(name = "DATA_MODIFICACAO", nullable = false)
	private Date dataModificacao;
	
	@Column(name = "E_ATIVO", nullable = false)
	private Boolean eAtivo;
	
	public DiretorioModel() { }

	public UUID getCodigo() {
		return codigo;
	}

	public void setCodigo(UUID codigo) {
		this.codigo = codigo;
	}

	public UUID getDiretorioPai() {
		return diretorioPai;
	}

	public void setDiretorioPai(UUID diretorioPai) {
		this.diretorioPai = diretorioPai;
	}

	public UUID getPessoa() {
		return pessoa;
	}

	public void setPessoa(UUID pessoa) {
		this.pessoa = pessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getTamanho() {
		return tamanho;
	}

	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(Date dataModificacao) {
		this.dataModificacao = dataModificacao;
	}

	public Boolean geteAtivo() {
		return eAtivo;
	}

	public void seteAtivo(Boolean eAtivo) {
		this.eAtivo = eAtivo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DiretorioModel other = (DiretorioModel) obj;
		return Objects.equals(codigo, other.codigo);
	}

}