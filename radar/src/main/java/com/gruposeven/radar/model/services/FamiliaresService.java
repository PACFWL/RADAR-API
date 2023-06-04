package com.gruposeven.radar.model.services;

import com.gruposeven.radar.model.dto.FamiliarDTO;
import com.gruposeven.radar.model.entity.Familiar;

import java.util.List;
import java.util.Optional;

public interface FamiliaresService {
    Familiar save(FamiliarDTO dto);
    List<Familiar> listAll();
    Familiar update(Long id, FamiliarDTO dto);
    Optional<Familiar> getById(Long id);
    void delete(Long id);
    long allFamiliares();
}