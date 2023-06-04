package com.gruposeven.radar.model.services;

import com.gruposeven.radar.model.dto.DesaparecidoDTO;
import com.gruposeven.radar.model.entity.Desaparecido;

import java.util.List;
import java.util.Optional;

public interface DesaparecidosService {
    Desaparecido save(Desaparecido dto);
    List<Desaparecido> listAll();
    Optional<Desaparecido> getDesaparecido(Long id);
    Desaparecido update(Long id, Desaparecido dto);
    void delete(Long id);
    long allDesaparecidos();
}