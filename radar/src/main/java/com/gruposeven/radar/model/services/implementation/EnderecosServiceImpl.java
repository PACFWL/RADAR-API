package com.gruposeven.radar.model.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gruposeven.radar.model.repository.DesaparecidosRepository;
import com.gruposeven.radar.model.repository.EnderecosRepository;
import com.gruposeven.radar.model.services.EnderecosService;

@Service
public class EnderecosServiceImpl implements EnderecosService{

    @Autowired
    private EnderecosRepository enderecosRepository;
	@Override
	public long allEnderecos() {
	
		return enderecosRepository.count();
	}
}
