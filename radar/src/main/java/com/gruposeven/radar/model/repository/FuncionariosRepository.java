package com.gruposeven.radar.model.repository;

import com.gruposeven.radar.model.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
@Repository
public interface FuncionariosRepository extends JpaRepository<Funcionario, Long> {
	long count();
}
