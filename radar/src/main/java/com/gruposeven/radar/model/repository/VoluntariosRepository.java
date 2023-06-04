package com.gruposeven.radar.model.repository;

import com.gruposeven.radar.model.entity.Voluntario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoluntariosRepository extends JpaRepository<Voluntario, Long> {
	long count();
}
