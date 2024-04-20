package com.PIVI.serverpulseira.repositories;

import com.PIVI.serverpulseira.model.Entity.DadosPulseiraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DadosPulseiraRepository extends JpaRepository<DadosPulseiraEntity, Integer> {
}
