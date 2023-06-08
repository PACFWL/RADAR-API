package com.gruposeven.radar.model.services;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.gruposeven.radar.model.entity.Foto; 

public interface FotosService {

    public Foto upload(MultipartFile file) throws IOException;
    public byte[] getImage(String altText);
    public List<Foto> getAll();
}
