package com.digitalinnovationonedesafiospring.ControleDePonto.repository;

import com.digitalinnovationonedesafiospring.ControleDePonto.model.Calendario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarioRepository extends JpaRepository<Calendario, Long> {
}
