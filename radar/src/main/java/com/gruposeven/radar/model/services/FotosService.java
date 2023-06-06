package com.gruposeven.radar.model.services;

import com.gruposeven.radar.model.entity.Desaparecido;
import com.gruposeven.radar.model.entity.Foto;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.stream.Stream;

import java.util.List; 

public interface FotosService {

    Foto upload(MultipartFile file) throws IOException;
    byte[] getImage(String nome);
    List<Foto> getAll();
}
