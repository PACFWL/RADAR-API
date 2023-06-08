package com.gruposeven.radar.model.services;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.gruposeven.radar.model.entity.Foto; 

public interface FotosService {

    Foto upload(MultipartFile file) throws IOException;
    byte[] getImage(String altText);
    List<Foto> getAll();
}
