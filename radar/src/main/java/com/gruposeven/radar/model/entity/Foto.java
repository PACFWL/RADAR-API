package com.gruposeven.radar.model.entity;

import jakarta.persistence.*;

@Entity
public class Foto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idFoto;

    @Column(nullable = false)
    private String altText;

    @Lob
    @Column(columnDefinition = "BLOB")
    private byte[] imageBytes;
}
