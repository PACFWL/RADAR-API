package com.gruposeven.radar.controller;

import com.gruposeven.radar.model.entity.Endereco;
import com.gruposeven.radar.model.services.EnderecosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class EnderecosController {
    @Autowired
    private EnderecosService service;
    
    @GetMapping("/enderecos/total")
    public ResponseEntity<Long> total() {
    	return ResponseEntity.ok(service.allEnderecos());
    }
}