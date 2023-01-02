package br.com.quintinno.sisgerarqapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class Application {
	
//	@Autowired
//	private DiretorioService diretorioService;
//	
//	@Autowired
//	private ArquivoService arquivoService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping
	public String api() {
		return "SISGERARQ - Sistema Gerenciador de Arquivos (API)";
	}
	
//	@PostConstruct
//	public void persistence() {
//		saveDiretorio();
//	}
	
//	public void saveDiretorio() {
//		DiretorioModel diretorioModel1 = new DiretorioModel();
//			diretorioModel1.setNome("Biblioteca");
//			diretorioModel1.setDiretorioPai(null);
//			diretorioModel1.setPessoa(UUID.randomUUID());
//			diretorioModel1.setTamanho(0);
//			diretorioModel1.setDataCriacao(new Date());
//			diretorioModel1.setDataModificacao(new Date());
//			diretorioModel1.seteAtivo(true);
//
//			diretorioModel1 = this.diretorioService.saveOne(diretorioModel1);
//
//		DiretorioModel diretorioModel2 = new DiretorioModel();
//			diretorioModel2.setNome("Livros");
//			diretorioModel2.setDiretorioPai(diretorioModel1.getCodigo());
//			diretorioModel2.setPessoa(UUID.randomUUID());
//			diretorioModel2.setTamanho(0);
//			diretorioModel2.setDataCriacao(new Date());
//			diretorioModel2.setDataModificacao(new Date());
//			diretorioModel2.seteAtivo(true);
//
//			this.diretorioService.saveOne(diretorioModel2);
//
//		DiretorioModel diretorioModel3 = new DiretorioModel();
//			diretorioModel3.setNome("Revistas");
//			diretorioModel3.setDiretorioPai(diretorioModel1.getCodigo());
//			diretorioModel3.setPessoa(UUID.randomUUID());
//			diretorioModel3.setTamanho(0);
//			diretorioModel3.setDataCriacao(new Date());
//			diretorioModel3.setDataModificacao(new Date());
//			diretorioModel3.seteAtivo(true);
//
//			this.diretorioService.saveOne(diretorioModel3);
//
//		DiretorioModel diretorioModel4 = new DiretorioModel();
//			diretorioModel4.setNome("Apostilas");
//			diretorioModel4.setDiretorioPai(diretorioModel1.getCodigo());
//			diretorioModel4.setPessoa(UUID.randomUUID());
//			diretorioModel4.setTamanho(0);
//			diretorioModel4.setDataCriacao(new Date());
//			diretorioModel4.setDataModificacao(new Date());
//			diretorioModel4.seteAtivo(true);
//
//			this.diretorioService.saveOne(diretorioModel4);
//
//		ArquivoModel arquivoModel1 = new ArquivoModel();
//			arquivoModel1.setCodigo(UUID.randomUUID());
//			arquivoModel1.setDiretorioModel(diretorioModel2);
//			arquivoModel1.seteAtivo(true);
//			arquivoModel1.setExtencao("PDF");
//			arquivoModel1.setNome("A Arte da Guerra");
//			arquivoModel1.setPessoa(UUID.randomUUID());
//			arquivoModel1.setTamanho(1500);
//			arquivoModel1.setDataCriacao(new Date());
//			arquivoModel1.setDataModificacao(new Date());
//			arquivoModel1.setUrl("");
//
//			this.arquivoService.saveOne(arquivoModel1);
//
//	}
	
}
