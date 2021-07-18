package com.digitalinnovationonedesafiospring.ControleDePonto.repository;

import com.digitalinnovationonedesafiospring.ControleDePonto.model.TipoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDataRepository extends JpaRepository<TipoData, Long> {
}
