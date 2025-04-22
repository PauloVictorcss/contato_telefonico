package com.contatos.demo;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "grupo")
public class Grupo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @ManyToMany
    @Column(nullable = false)
    private List<Contato> contatos;


    public Grupo(Integer id, String name, List<Contato> contatos) {
        this.id = id;
        this.name = name;
        this.contatos = contatos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }
}
