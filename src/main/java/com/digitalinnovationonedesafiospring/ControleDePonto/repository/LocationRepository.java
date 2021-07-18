package com.digitalinnovationonedesafiospring.ControleDePonto.repository;

import com.digitalinnovationonedesafiospring.ControleDePonto.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
}
