package com.PIVI.serverpulseira.repositories;

import com.PIVI.serverpulseira.model.Entity.PulseiraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PulseiraRepository extends JpaRepository<PulseiraEntity, Integer> {
}
