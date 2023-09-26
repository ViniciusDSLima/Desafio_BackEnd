package br.com.banco.repository;

import br.com.banco.domain.entity.Conta;
import br.com.banco.domain.entity.Transferencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferenciaRepository extends JpaRepository<Transferencia, Long> {
}
