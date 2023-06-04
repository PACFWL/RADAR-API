package com.gruposeven.radar.model.services.implementation;

import com.gruposeven.radar.model.dto.VoluntarioDTO;
import com.gruposeven.radar.model.entity.Voluntario;
import com.gruposeven.radar.model.repository.EnderecosRepository;
import com.gruposeven.radar.model.repository.VoluntariosRepository;
import com.gruposeven.radar.model.services.VoluntariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VoluntariosServiceImpl implements VoluntariosService {
    @Autowired
    private VoluntariosRepository voluntariosRepository;

    @Autowired
    private EnderecosRepository enderecosRepository;

    @Override
    public Voluntario save(VoluntarioDTO dto) {
        Voluntario voluntario = dto.toModel(dto);
        enderecosRepository.save(voluntario.getEndereco());

        return voluntariosRepository.save(voluntario);
    }

    @Override
    public List<Voluntario> getAll() {
        return voluntariosRepository.findAll();
    }

    @Override
    public Optional<Voluntario> getVoluntario(Long id) {
        return voluntariosRepository.findById(id);
    }

    @Override
    public Voluntario update(Long id, VoluntarioDTO dto) {
        Voluntario voluntario = dto.toModel(dto);
        voluntario.setId(id);

        enderecosRepository.save(voluntario.getEndereco());


        return voluntariosRepository.save(voluntario);
    }

    @Override
    public void delete(Long id) {
        voluntariosRepository.deleteById(id);
    }
    @Override
	public long allVoluntarios() {
	
		return voluntariosRepository.count();
	}
}
