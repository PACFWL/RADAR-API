package com.gruposeven.radar.model.repository;

import com.gruposeven.radar.model.entity.Foto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional; 

@Repository
public interface FotosRepository extends JpaRepository<Foto, Long> {
	 Optional<Foto> findByNome(String altText); 
}
