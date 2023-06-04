package com.gruposeven.radar.model.dto;

import java.util.List;

import com.gruposeven.radar.model.entity.Endereco;
import com.gruposeven.radar.model.entity.Funcionario;

public class FuncionarioDTO {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;
    private String dataNascimento;
    private Endereco endereco;
    private String phone;
    private String funcao;

    public FuncionarioDTO() {
    }

    public FuncionarioDTO(String nome, String sobrenome, String cpf, String email, String dataNascimento, Endereco endereco, String phone, String funcao) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.phone = phone;
        this.funcao = funcao;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Funcionario toModel(FuncionarioDTO dto) {
        return new Funcionario(
                dto.getNome(),
                dto.getSobrenome(),
                dto.getCpf(),
                dto.getEmail(),
                dto.getDataNascimento(),
                dto.getEndereco(),
                dto.getPhone(),
                dto.getFuncao()
        );
    }
}
