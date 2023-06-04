package com.gruposeven.radar.model.services.implementation;

import com.gruposeven.radar.model.dto.FamiliarDTO;
import com.gruposeven.radar.model.entity.Familiar;
import com.gruposeven.radar.model.repository.FamiliaresRepositories;
import com.gruposeven.radar.model.services.FamiliaresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FamiliaresServiceImpl implements FamiliaresService {
    @Autowired
    private FamiliaresRepositories repository;

    @Override
    public Familiar save(FamiliarDTO dto) {
        Familiar familiar = dto.toModel(dto);

        return repository.save(familiar);
    }

    @Override
    public List<Familiar> listAll() {
        return repository.findAll();
    }

    @Override
    public Familiar update(Long id, FamiliarDTO dto) {
        Familiar familiar = dto.toModel(dto);
        familiar.setId(id);
        return repository.save(familiar);
    }

    @Override
    public Optional<Familiar> getById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
    @Override
	public long allFamiliares() {
	
		return repository.count();
	}
}
