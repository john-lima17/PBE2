package br.com.joalheriajoiasjoia.app.repositories;

import br.com.joalheriajoiasjoia.app.entities.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
