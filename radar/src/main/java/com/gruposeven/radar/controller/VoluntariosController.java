package com.gruposeven.radar.controller;

import com.gruposeven.radar.model.dto.VoluntarioDTO;
import com.gruposeven.radar.model.entity.Voluntario;
import com.gruposeven.radar.model.services.VoluntariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class VoluntariosController {
    @Autowired
    private VoluntariosService service;

    @PostMapping("/voluntarios")
    public ResponseEntity<Voluntario> save(@RequestBody VoluntarioDTO dto) {
        return ResponseEntity.ok(service.save(dto));
    }

    @GetMapping("/voluntarios")
    public ResponseEntity<List<Voluntario>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/voluntarios/{id}")
    public ResponseEntity<Optional<Voluntario>> getOne(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.getVoluntario(id));
    }

    @PutMapping("/voluntarios/{id}")
    public ResponseEntity<Voluntario> update(@PathVariable Long id, @RequestBody VoluntarioDTO dto) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/voluntarios/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
    @GetMapping("/voluntarios/total")
    public ResponseEntity<Long> total() {
    	return ResponseEntity.ok(service.allVoluntarios());
    }
}
