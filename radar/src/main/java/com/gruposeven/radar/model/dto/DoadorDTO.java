package com.gruposeven.radar.model.dto;

import com.gruposeven.radar.model.entity.Doador;
import com.gruposeven.radar.model.entity.Endereco;

public class DoadorDTO {
    private String nome;
    private String sobrenome;
    private String cpf;
    private Endereco enderecoDTO;
    private Double valor;
    private String telefone;

    public DoadorDTO() {
    }

    public DoadorDTO(String nome, String sobrenome, String cpf, Endereco enderecoDTO, Double valor, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.enderecoDTO = enderecoDTO;
        this.valor = valor;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return enderecoDTO;
    }

    public void setEndereco(Endereco enderecoDTO) {
        this.enderecoDTO = enderecoDTO;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Doador toModel(DoadorDTO dto) {
        return new Doador(
                dto.getNome(),
                dto.getSobrenome(),
                dto.getCpf(),
                dto.getEndereco(),
                dto.getValor(),
                dto.getTelefone()
        );
    }
}
