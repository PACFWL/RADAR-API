package com.gruposeven.radar.model.services.implementation;

import com.gruposeven.radar.model.dto.FuncionarioDTO;
import com.gruposeven.radar.model.entity.Endereco;
import com.gruposeven.radar.model.entity.Funcionario;
import com.gruposeven.radar.model.repository.EnderecosRepository;
import com.gruposeven.radar.model.repository.FuncionariosRepository;
import com.gruposeven.radar.model.services.FuncionariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionariosServiceImpl implements FuncionariosService {
    @Autowired
    private FuncionariosRepository funcionariosRepository;

    @Autowired
    private EnderecosRepository enderecosRepository;
    
    @Override
    public Funcionario save(FuncionarioDTO dto) {
        Funcionario funcionario = dto.toModel(dto);

        enderecosRepository.save(funcionario.getEndereco());

        return funcionariosRepository.save(funcionario);
    }

    @Override
    public List<Funcionario> listAll() {
        return funcionariosRepository.findAll();
    }

    @Override
    public Optional<Funcionario> getFuncionario(Long id) {
        return funcionariosRepository.findById(id);
    }

    @Override
    public Funcionario update(Long id, FuncionarioDTO dto) {
        Funcionario funcionario = dto.toModel(dto);

        funcionario.setId(id);

        Endereco endereco = enderecosRepository.getReferenceById(funcionario.getEndereco().getIdEndereco());
        endereco.setIdEnderec(funcionario.getEndereco().getIdEndereco());
        enderecosRepository.save(endereco);

        return funcionariosRepository.save(funcionario);
    }

    @Override
    public void delete(Long id) {
        funcionariosRepository.deleteById(id);
    }
    
    @Override
	public long allFuncionarios() {
	
		return funcionariosRepository.count();
	}
}
