package com.digitalinnovationonedesafiospring.ControleDePonto.repository;

import com.digitalinnovationonedesafiospring.ControleDePonto.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {
}
