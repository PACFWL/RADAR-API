package com.gruposeven.radar.model.entity;

import jakarta.persistence.*;

@Entity
public class Foto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idFoto;
    private String caminho; 


    @Column(nullable = false)
    private String altText;

    @Lob
    @Column(name = "arquivo", length = 7168) 
    private byte[] imageBytes;
    
    public Foto() {
    	
    }
    
    public Long getIdFoto() {
    	 return idFoto;
	 }
    
	 public void setIdFoto(Long idFoto) {
		 this.idFoto = idFoto;
	 }
	 
	 public String getCaminho() {
		 return caminho;
	 }
	 
	 public void setCaminho(String caminho) {
		 this.caminho = caminho;
	 } 
	 
	 public String getAltText() {
    	 return altText;
	 }
    
	 public void setAltText(String altText) {
		 this.altText = altText;
	 }
    
	 public byte[] getArquivo() {
		 return imageBytes;
	 }
	 
	 public void setArquivo(byte[] imageBytes) {
		 this.imageBytes = imageBytes; 
	 } 
}
