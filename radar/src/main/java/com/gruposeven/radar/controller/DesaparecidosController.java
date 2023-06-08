package com.gruposeven.radar.controller;

import com.gruposeven.radar.model.dto.DesaparecidoDTO;
import com.gruposeven.radar.model.entity.Desaparecido;
import com.gruposeven.radar.model.entity.Foto;
import com.gruposeven.radar.model.services.DesaparecidosService;
import com.gruposeven.radar.model.services.FotosService;

import io.swagger.v3.oas.models.media.MediaType;

import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class DesaparecidosController {
	
    @Autowired
    private DesaparecidosService service;

    private FotosService serviceFoto;

    @PostMapping("/desaparecidos")
   
    public ResponseEntity<Desaparecido> save(@RequestBody Desaparecido dto) {
        //return ResponseEntity.ok(service.save(dto));
    	Desaparecido desaparecido = service.save(dto);

        if (desaparecido != null) {
            // https://haseeamarathunga.medium.com/create-a-spring-boot-angular-websocket-using-sockjs-and-stomp-cb339f766a98
     }
        
        return ResponseEntity.ok(desaparecido);
    }
    
    @CrossOrigin
    @RequestMapping(
    	    path = "/desaparecidos", 
    	    method = RequestMethod.POST, 
    	    consumes="multipart/form-data")
    	public ResponseEntity<String> handleupload(MultipartFile file) throws IOException{
    		if(!file.isEmpty()) {
    			try {
    				serviceFoto.upload(file);
    					return ResponseEntity.ok().body("Imagem enviada");
    			} catch (FileNotFoundException e) {
    				 	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Arquivo nao encontrado"); 
    			} catch (FileUploadException e) {
    					return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Falha ao enviar o arquivo");
    				 } catch (IOException e) {
    					return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Falha erro de I/O");
    				 } 
    		} else {
    			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Arquivo vazio");
    		}
    }

    @GetMapping("/desaparecidos")
    public ResponseEntity<List<Desaparecido>> getAll() {
        return ResponseEntity.ok(service.listAll());
    }

    @GetMapping("/desaparecidos/{id}")
    public ResponseEntity<Optional<Desaparecido>> getOne(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.getDesaparecido(id));
    }

    @PutMapping("/desaparecidos/{id}")
    public ResponseEntity<Desaparecido> update(@PathVariable Long id, @RequestBody Desaparecido dto) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/desaparecidos/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
    
    @GetMapping("/desaparecidos/total")
    public ResponseEntity<Long> total() {
    	return ResponseEntity.ok(service.allDesaparecidos());
    }
}