package com.contatos.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceGrupo {

    @Autowired
    RepositoryGrupo repository;

    public Grupo save(Grupo grupo){
        return repository.save(grupo);

    }

    public List<Grupo> findAll(){
        return repository.findAll();
    }

    public Grupo findById(Integer id){
        return repository.findById(id).orElse(null);
    }

    public Grupo updateGrupo(Grupo grupo, Integer id){
        Grupo grupo1 = repository.findById(id).orElse(null);

        return repository.save(grupo);
    }

    public Grupo deleteById(Integer id){
        return repository.findById(id).orElse(null);
    }
}
