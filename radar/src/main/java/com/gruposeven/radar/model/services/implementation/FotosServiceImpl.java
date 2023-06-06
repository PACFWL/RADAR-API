package com.gruposeven.radar.model.services.implementation;

import com.gruposeven.radar.model.entity.Desaparecido;
import com.gruposeven.radar.model.entity.Foto;
import com.gruposeven.radar.model.repository.FotosRepository;
import com.gruposeven.radar.model.services.FotosService;
import com.gruposeven.radar.util.ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files; 

import java.io.IOException;
import java.util.Optional;
import java.util.stream.Stream;

import java.util.List; 

@Service
public class FotosServiceImpl implements FotosService {
	
    @Autowired
    private FotosRepository fotosRepository;

    @Override
    public Foto upload(MultipartFile file) throws IOException {
    	 String nome = file.getOriginalFilename(); 
        //return fotosRepository.save(new Foto.FotoBuilder(file.getOriginalFilename(), file.getName(), file.getContentType(), file.getBytes()).build());
    	byte[] conteudo = file.getBytes();
    	 Path caminhoArquivo = Paths.get("imagens/" + nome);
    	 Foto imagem = new Foto();
    	 imagem.setAltText(file.getOriginalFilename());
    	 imagem.setCaminho(caminhoArquivo.toString());
    	 imagem.setArquivo(file.getBytes());
    	 /***********************************************************/
    	 Files.write(caminhoArquivo, file.getBytes());
    	 return fotosRepository.save(imagem);
    }

    @Override
    public byte[] getImage(String nomeArquivo) {
    	 Foto imagem = fotosRepository.findByNome(nomeArquivo).get();
        return imagem.getArquivo();
    }

    @Override
    public List<Foto> getAll() {
        return fotosRepository.findAll();
    }
}
