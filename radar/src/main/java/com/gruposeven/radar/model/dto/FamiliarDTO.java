package com.gruposeven.radar.model.dto;

import com.gruposeven.radar.model.entity.Familiar;

import java.time.LocalDate;

public class FamiliarDTO {

    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String grauDeParentesco;
    private String dataDeNascimento;
    private DesaparecidoDTO desaparecido;

    public FamiliarDTO() {
    }

    public FamiliarDTO(String nome, String cpf, String email, String telefone, String grauDeParentesco, String dataDeNascimento, DesaparecidoDTO desaparecido) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.grauDeParentesco = grauDeParentesco;
        this.dataDeNascimento = dataDeNascimento;
        this.desaparecido = desaparecido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGrauDeParentesco() {
        return grauDeParentesco;
    }

    public void setGrauDeParentesco(String grauDeParentesco) {
        this.grauDeParentesco = grauDeParentesco;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public DesaparecidoDTO getDesaparecido() {
        return desaparecido;
    }

    public void setDesaparecido(DesaparecidoDTO desaparecido) {
        this.desaparecido = desaparecido;
    }

    public Familiar toModel(FamiliarDTO dto) {
        return new Familiar(
                dto.getNome(),
                dto.getCpf(),
                dto.getEmail(),
                dto.getTelefone(),
                dto.getGrauDeParentesco(),
                dto.getDataDeNascimento(),
                dto.getDesaparecido().toModel(desaparecido)
        );
    }
}
