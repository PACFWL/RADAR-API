package com.gruposeven.radar.model.services.implementation;

import com.gruposeven.radar.model.dto.DesaparecidoDTO;
import com.gruposeven.radar.model.entity.Desaparecido;
import com.gruposeven.radar.model.repository.DesaparecidosRepository;
import com.gruposeven.radar.model.repository.EnderecosRepository;
//import com.fateczl.radarapi.model.repository.FotosRepository;
import com.gruposeven.radar.model.services.DesaparecidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class DesaparecidosServiceImpl implements DesaparecidosService {
    @Autowired
    private DesaparecidosRepository desaparecidosRepository;

    @Autowired
    private EnderecosRepository enderecosRepository;

    //@Autowired
    //private FotosRepository fotosRepository;

    @Override
    @Transactional
    public Desaparecido save(Desaparecido dto) {


        //Desaparecido desaparecidoConvert = dto.toModel(dto);

        enderecosRepository.save(dto.getEndereco());
        //fotosRepository.saveAll(desaparecidoConvert.getFotos());

        return  desaparecidosRepository.save(dto);
    }

    @Override
    public List<Desaparecido> listAll() {
        return desaparecidosRepository.findAll();
    }

    @Override
    public Optional<Desaparecido> getDesaparecido(Long id) {
        return desaparecidosRepository.findById(id);
    }

    @Override
    @Transactional
    public Desaparecido update(Long id, Desaparecido dto) {
        //Desaparecido desaparecidoConvert = dto.toModel(dto);
        dto.setIdDesaparecido(id);

        return desaparecidosRepository.save(dto);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        desaparecidosRepository.deleteById(id);
    }

	@Override
	public long allDesaparecidos() {
	
		return desaparecidosRepository.count();
	}
}