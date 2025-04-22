package com.contatos.demo;

import jakarta.persistence.*;

import java.util.List;

public class DTOContato {

    private Integer id;

    private String nome;

    private String email;

    private String telefone;

    private boolean favorito;

    private List<Grupo> grupos;


    public DTOContato(Integer id, String nome, String email, String telefone, boolean favorito, List<Grupo> grupos) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.favorito = favorito;
        this.grupos = grupos;
    }

    public DTOContato(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }
}
