package com.gruposeven.radar.model.services;

import com.gruposeven.radar.model.dto.FuncionarioDTO;

import com.gruposeven.radar.model.entity.Funcionario;

import java.util.List;
import java.util.Optional;

public interface FuncionariosService {

    Funcionario save(FuncionarioDTO dto);
    List<Funcionario> listAll();
    Optional<Funcionario> getFuncionario(Long id);
    Funcionario update(Long id, FuncionarioDTO dto);
    void delete(Long id);
    long allFuncionarios();

}
