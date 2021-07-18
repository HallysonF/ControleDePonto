package com.digitalinnovationonedesafiospring.ControleDePonto.repository;

import com.digitalinnovationonedesafiospring.ControleDePonto.model.Ocorrencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long> {
}
