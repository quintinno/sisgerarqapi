package br.com.quintinno.sisgerarqapi.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "TB_ARQUIVO")
public class ArquivoModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CODIGO", unique = true, nullable = false)
	private UUID codigo;

	@ManyToOne
	@JoinColumn(name = "ID_DIRETORIO", nullable = false)
	private DiretorioModel diretorioModel;
	
	@Column(name = "ID_PESSOA", unique = true, nullable = false)
	private UUID pessoa;
	
	@Column(name = "NOME", nullable = false)
	private String nome;
	
	@Column(name = "TAMANHO", nullable = false)
	private Long tamanho;
	
	@Column(name = "EXTENCAO", nullable = false)
	private String extencao;

	@Column(name = "DATA_CRIACAO", nullable = false)
	private Date dataCriacao;

	@Column(name = "DATA_MODIFICACAO")
	private Date dataModificacao;
	
	@Column(name = "URL", nullable = false)
	private String url;
	
	@Column(name = "E_ATIVO", nullable = false)
	private Boolean eAtivo;

	@Transient
	private Long sistemaOrigem;

	public ArquivoModel() { }

	public ArquivoModel(String nome, Long tamanho, String extencao) {
		this.pessoa = UUID.randomUUID();
		this.nome = nome;
		this.tamanho = tamanho;
		this.extencao = extencao;
		this.dataCriacao = new Date();
		this.eAtivo = true;
	}

	public UUID getCodigo() {
		return codigo;
	}

	public void setCodigo(UUID codigo) {
		this.codigo = codigo;
	}

	public Long getSistemaOrigem() {
		return sistemaOrigem;
	}

	public void setSistemaOrigem(Long sistemaOrigem) {
		this.sistemaOrigem = sistemaOrigem;
	}

	public DiretorioModel getDiretorioModel() {
		return diretorioModel;
	}

	public void setDiretorioModel(DiretorioModel diretorioModel) {
		this.diretorioModel = diretorioModel;
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

	public Long getTamanho() {
		return tamanho;
	}

	public void setTamanho(Long tamanho) {
		this.tamanho = tamanho;
	}

	public String getExtencao() {
		return extencao;
	}

	public void setExtencao(String extencao) {
		this.extencao = extencao;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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
		ArquivoModel other = (ArquivoModel) obj;
		return Objects.equals(codigo, other.codigo);
	}

}
