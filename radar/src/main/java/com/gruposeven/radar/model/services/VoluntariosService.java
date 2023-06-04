package com.gruposeven.radar.model.services;

import com.gruposeven.radar.model.dto.VoluntarioDTO;
import com.gruposeven.radar.model.entity.Voluntario;

import java.util.List;
import java.util.Optional;

public interface VoluntariosService {

    Voluntario save(VoluntarioDTO dto);
    List<Voluntario> getAll();
    Optional<Voluntario> getVoluntario(Long id);
    Voluntario update(Long id, VoluntarioDTO dto);
    void delete(Long id);
    long allVoluntarios();
}
