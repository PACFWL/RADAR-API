package com.gruposeven.radar.model.repository;

import com.gruposeven.radar.model.entity.Doador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoadoresRepository extends JpaRepository<Doador, Long> {
	long count();
}
