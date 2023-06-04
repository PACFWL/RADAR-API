package com.gruposeven.radar.model.repository;

import com.gruposeven.radar.model.entity.Desaparecido;
import com.gruposeven.radar.model.entity.Foto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface DesaparecidosRepository extends JpaRepository<Desaparecido, Long> {
	long count();
}