package com.contatos.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceContato {

    @Autowired
    RepositoryContato repository;

    public Contato save(Contato contato){
        return repository.save(contato);

    }

    public List<Contato> findAll(){
        return repository.findAll();
    }

    public Contato findById(Integer id){
        return repository.findById(id).orElse(null);
    }

}
