package com.gruposeven.radar.model.entity;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String sobrenome;
    
    /**    @Column(nullable = false)

    private String username;
**/
    @Column(nullable = false)
    private String cpf;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    
    private String dataNascimento;
    @ElementCollection(fetch = FetchType.EAGER)

  /**  @CollectionTable(name = "users_roles", joinColumns = @JoinColumn(name = "usuario_id"))

    @Column(name = "roles_id")

    private List<String> roles;

    @Column(nullable = false)

    private String password; **/
    @OneToOne
    private Endereco endereco;

    @Column(nullable = false)
    private String funcao;

    @Column(nullable = false)
    private String phone;

    public Funcionario() {
    }

    public Funcionario(Long id, String nome, String sobrenome, String cpf, String email, String dataNascimento, Endereco endereco, String funcao, String phone) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        //this.username = username;
        this.cpf = cpf;
        this.email = email;
        this.dataNascimento = dataNascimento;
      //  this.roles = roles;
     //   this.password = password;
        this.endereco = endereco;
        this.phone = phone;
        this.funcao = funcao;
    }

    public Funcionario(String nome, String sobrenome, String cpf, String email, String dataNascimento, Endereco endereco,String funcao, String phone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
     //   this.username = username;
        this.cpf = cpf;
        this.email = email;
        this.dataNascimento = dataNascimento;
       // this.roles = roles;
       // this.password = password;
        this.endereco = endereco;
        this.phone = phone;
        this.funcao = funcao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    
}
