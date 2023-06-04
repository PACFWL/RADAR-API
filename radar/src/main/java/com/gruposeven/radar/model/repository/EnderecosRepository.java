package com.gruposeven.radar.model.repository;

import com.gruposeven.radar.model.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecosRepository extends JpaRepository<Endereco, Long> {
	long count();
}
