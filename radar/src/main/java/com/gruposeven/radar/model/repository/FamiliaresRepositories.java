package com.gruposeven.radar.model.repository;


import com.gruposeven.radar.model.entity.Familiar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamiliaresRepositories extends JpaRepository<Familiar, Long> {
	long count();
}
