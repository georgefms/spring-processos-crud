package br.com.georgefms.processosweb.repositories;

import br.com.georgefms.processosweb.models.TipodeProcesso;
import org.springframework.data.jpa.repository.JpaRepository;

//Permite a persistĂȘncia no Banco de dados
public interface TipodeProcessoRepository extends JpaRepository<TipodeProcesso, Long> {
}
