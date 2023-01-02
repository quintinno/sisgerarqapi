package br.com.quintinno.sisgerarqapi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class DiretorioImplementacaoRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public Boolean verificarDiretorioDuplicado(Long codigoDiretorioPai, String nomeDiretorio) {
		String QUERY_RECUPERAR_DIRETORIO_DUPLICADO = "select row_number() over (partition by diretorio1.nome order by diretorio1.nome) as quantidade\r\n"
				+ "			from tb_diretorio diretorio1\r\n"
				+ "			join tb_diretorio diretorio2 on diretorio2.codigo = diretorio1.codigo\r\n"
				+ "				and diretorio1.nome = diretorio2.nome\r\n"
				+ "					and diretorio2.id_diretorio_pai = diretorio1.id_diretorio_pai\r\n"
				+ "						and diretorio1.id_diretorio_pai = :codigoDiretorioPai\r\n"
				+ "							and diretorio2.nome like :nomeDiretorio";
		Query query = this.entityManager.createNativeQuery(QUERY_RECUPERAR_DIRETORIO_DUPLICADO);
			query.setParameter("codigoDiretorioPai", codigoDiretorioPai);
			query.setParameter("nomeDiretorio", nomeDiretorio);
		return query.getResultList().size() == 0;
	}

}
