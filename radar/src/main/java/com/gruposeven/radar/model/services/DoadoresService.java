package com.gruposeven.radar.model.services;

import com.gruposeven.radar.model.dto.DoadorDTO;
import com.gruposeven.radar.model.entity.Doador;

import java.util.List;
import java.util.Optional;

public interface DoadoresService {
    Doador save(DoadorDTO dto);
    List<Doador> listAll();
    Optional<Doador> getById(Long id);
    Doador update(Long id, DoadorDTO dto);
    void delete(Long id);
    long allDoadores();
}
